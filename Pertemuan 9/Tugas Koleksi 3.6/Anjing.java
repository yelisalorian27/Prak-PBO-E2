/**
 * File : Anjing.java
 * Deskripsi : Implementasi kelas Anjing sebagai turunan dari kelas Anabul
 * Pembuat : Yelisa Lorian
 * Tanggal: 11 Mei 2025
 **/

 public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    public void gerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }

    public void bersuara() {
        System.out.println(nama + " berbunyi guk-guk.");
    }
}
