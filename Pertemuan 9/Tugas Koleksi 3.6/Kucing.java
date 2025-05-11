/**
 * File : Kucing.java
 * Deskripsi : Implementasi kelas Kucing sebagai turunan dari kelas Anabul
 * Pembuat : Yelisa Lorian
 * Tanggal: 11 Mei 2025
 **/

 public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    public void gerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }

    public void bersuara() {
        System.out.println(nama + " berbunyi meong.");
    }
}