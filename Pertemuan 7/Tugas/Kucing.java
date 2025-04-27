/* Nama File : Kucing.java
 * Deskripsi : Kelas turunan dari Anabul yang merepresentasikan kucing dengan perilaku khusus
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 27 April 2025
 */

class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi meong.");
    }
}