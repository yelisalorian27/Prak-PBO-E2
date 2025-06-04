/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author yelisalorian
 */
public class Mahasiswa {
    // Atribut sesuai dengan kolom di tabel mahasiswa
    private int id;
    private String nama;
    
    // Constructor default
    public Mahasiswa() {
        // Constructor kosong diperlukan untuk framework dan object creation
    }
    
    // Constructor dengan parameter id dan nama
    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }
    
    // Constructor tanpa id (untuk insert data baru)
    public Mahasiswa(String nama) {
        this.nama = nama;
    }
    
    // Getter and Setter Methods
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    /**
     * Override toString method - disesuaikan dengan expected output
     * Format: "Mahasiswa{id=1, nama=Nina}"
     * @return 
     */
    
    @Override
    public String toString() {
        return "Mahasiswa{id=" + id + ", nama=" + nama + "}";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Mahasiswa mahasiswa = (Mahasiswa) obj;
        return id == mahasiswa.id;
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
    
    public boolean isValid() {
        return nama != null && !nama.trim().isEmpty();
    }
    
    public String getInfo() {
        return "ID: " + id + ", Nama: " + nama;
    }
}
