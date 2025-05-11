/**
 * File : KoleksiAnabul.java
 * Deskripsi : Implementasi kelas KoleksiAnabul yang menyimpan koleksi objek Anabul.
 * Pembuat : Yelisa Lorian
 * Tanggal: 11 Mei 2025
 **/

 public class KoleksiAnabul {
    private Koleksi<Anabul> koleksi;

    public KoleksiAnabul(int ukuran) {
        koleksi = new Koleksi<>(ukuran);
    }

    public boolean tambahAnabul(Anabul anabul) {
        return koleksi.add(anabul);
    }

    public void showAll() {
        System.out.println("Koleksi Anabul:");
        for (int i = 0; i < koleksi.getSize(); i++) {
            Anabul a = koleksi.getIsi(i);
            System.out.println("[" + i + "] Nama: " + a.nama);
            a.bersuara();
            a.gerak();
            System.out.println();
        }
        System.out.println("Jumlah Anabul: " + koleksi.getSize());
    }
}
