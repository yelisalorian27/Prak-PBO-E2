/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yelisalorian
 */
public class MysqlMahasiswaService {
    Connection koneksi = null;
    
    // Constructor
    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }
    
    /**
     * Membuat objek mahasiswa dari ResultSet
     */
    
    public Mahasiswa makeMhsObject(ResultSet rs) throws SQLException {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setId(rs.getInt("id"));
        mhs.setNama(rs.getString("nama"));
        return mhs;
    }
    
    /**
     * Menambahkan data mahasiswa ke database
     * Support insert dengan ID manual atau auto increment
     */
    
    public void add(Mahasiswa mhs) {
        String sql;
        
        // Jika ID = 0 atau tidak diset, gunakan auto increment
        if (mhs.getId() == 0) {
            sql = "INSERT INTO mahasiswa (nama) VALUES (?)";
        } else {
            // Jika ID sudah diset, insert dengan ID manual
            sql = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
        }
        
        try {
            PreparedStatement ps = koneksi.prepareStatement(sql);
            
            if (mhs.getId() == 0) {
                // Auto increment
                ps.setString(1, mhs.getNama());
            } else {
                // Manual ID
                ps.setInt(1, mhs.getId());
                ps.setString(2, mhs.getNama());
            }
            
            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("Berhasil insert");
            } else {
                System.out.println("Gagal menambahkan data mahasiswa");
            }
            
        } catch (SQLException e) {
            System.err.println("Error saat menambahkan data: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Update data mahasiswa di database
     */
    public void update(Mahasiswa mhs) {
        String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try {
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            
            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("Berhasil update");
            } else {
                System.out.println("Data mahasiswa dengan ID " + mhs.getId() + " tidak ditemukan");
            }
            
        } catch (SQLException e) {
            System.err.println("Error saat update data: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Delete data mahasiswa berdasarkan ID
     */
    public void delete(int id) {
        String sql = "DELETE FROM mahasiswa WHERE id = ?";
        try {
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setInt(1, id);
            
            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("Berhasil delete");
            } else {
                System.out.println("Data mahasiswa dengan ID " + id + " tidak ditemukan");
            }
            
        } catch (SQLException e) {
            System.err.println("Error saat menghapus data: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Ambil mahasiswa berdasarkan ID
     */
    public Mahasiswa getById(int id) {
        String sql = "SELECT * FROM mahasiswa WHERE id = ?";
        try {
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                Mahasiswa mhs = makeMhsObject(rs);
                return mhs;
            } else {
                System.out.println("Mahasiswa dengan ID " + id + " tidak ditemukan");
                return null;
            }
            
        } catch (SQLException e) {
            System.err.println("Error saat mencari mahasiswa: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    
    /**
     * Ambil semua data mahasiswa dari database
     */
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listMahasiswa = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa ORDER BY id";
        
        try {
            Statement stmt = koneksi.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                Mahasiswa mhs = makeMhsObject(rs);
                listMahasiswa.add(mhs);
            }
            
        } catch (SQLException e) {
            System.err.println("Error saat mengambil semua data: " + e.getMessage());
            e.printStackTrace();
        }
        
        return listMahasiswa;
    }
    
    /**
     * Method untuk mendapatkan jumlah total mahasiswa
     */
    public int getTotalMahasiswa() {
        String sql = "SELECT COUNT(*) as total FROM mahasiswa";
        try {
            Statement stmt = koneksi.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if (rs.next()) {
                return rs.getInt("total");
            }
            
        } catch (SQLException e) {
            System.err.println("Error saat menghitung total: " + e.getMessage());
            e.printStackTrace();
        }
        
        return 0;
    }
    
    /**
     * Method untuk menutup koneksi database
     */
    public void closeConnection() {
        MysqlUtility.closeConnection();
    }
}
