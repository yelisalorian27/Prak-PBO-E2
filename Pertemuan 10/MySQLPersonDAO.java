/**
* File : MySQLPersonDAO.java
* Deskripsi : implementasi PersonDAO untuk MySQL 
* Pembuat : Yelisa Lorian
* Tanggal: 16 Mei 2025
 */

import java.sql.*; 
 public class MySQLPersonDAO implements PersonDAO {
    
    public void savePerson(Person person) throws Exception {
        String name = person.getName();

        // Membuat koneksi ke database (nama DB, user, dan password harus disesuaikan)
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo", "root", "Yelisa27_");

        // Menyusun dan menjalankan query MySQL
        String query = "INSERT INTO person(name) VALUES('" + name + "')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);

        // Menutup koneksi database
        con.close();
    }
}