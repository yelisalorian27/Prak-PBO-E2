/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author yelisalorian
 */
public class MysqlUtility {
    private static Connection koneksi;
    
    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                String url = "jdbc:mysql://localhost:3306/mahasiswa_db?useSSL=false&serverTimezone=UTC";
               
                String user = "root";
                String password = ""; 
                
                koneksi = DriverManager.getConnection(url, user, password);
                
                if (koneksi != null) {
                    System.out.println("✅ Koneksi berhasil!");
                }
                
            } catch (ClassNotFoundException cne) {
                System.out.println("❌ Gagal load driver: " + cne.getMessage());
            } catch (SQLException sqle) {
                System.out.println("❌ Gagal koneksi: " + sqle.getMessage());
            }
        }
        return koneksi;
    }
   
    public static void closeConnection() {
        try {
            if (koneksi != null && !koneksi.isClosed()) {
                koneksi.close();
                koneksi = null;
                System.out.println("🔒 Koneksi ditutup");
            }
        } catch (SQLException e) {
            System.out.println("❌ Error tutup koneksi: " + e.getMessage());
        }
    }

    public static boolean testConnection() {
        Connection conn = getConnection();
        if (conn != null) {
            System.out.println("✅ Test koneksi berhasil!");
            return true;
        } else {
            System.out.println("❌ Test koneksi gagal!");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== TEST KONEKSI DATABASE ===");
        testConnection();
        closeConnection();
    }
}
