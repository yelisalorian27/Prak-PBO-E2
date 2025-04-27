/* Nama File : Anjing.java
 * Deskripsi : Kelas turunan dari Anabul yang merepresentasikan anjing dengan perilaku khusus
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 27 April 2025
 */

class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi guk-guk.");
    }
}
