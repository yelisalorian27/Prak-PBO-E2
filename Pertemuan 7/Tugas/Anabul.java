/* Nama File : Anabul.java
 * Deskripsi : Kelas induk untuk hewan peliharaan (anabul) yang memiliki metode gerak dan bersuara
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 27 April 2025
 */

class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public void gerak() {
        System.out.println(nama + " bergerak...");
    }

    public void bersuara() {
        System.out.println(nama + " bersuara...");
    }
}