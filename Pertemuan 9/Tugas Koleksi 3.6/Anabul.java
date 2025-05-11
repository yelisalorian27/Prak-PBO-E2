/**
 * File : Anabul.java
 * Deskripsi : kelas abstrak Anabul
 * Pembuat : Yelisa Lorian
 * Tanggal: 11 Mei 2025
 **/

 public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public void gerak() {
        System.out.println(nama + " bergerak.");
    }

    public void bersuara() {
        System.out.println(nama + " bersuara.");
    }
}