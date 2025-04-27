/* Nama File : Burung.java
 * Deskripsi : Kelas turunan dari Anabul yang merepresentasikan burung dengan perilaku khusus
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 27 April 2025
 */

class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan terbang.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi cuit.");
    }
}