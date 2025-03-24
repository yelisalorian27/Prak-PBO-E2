/* Nama File : IResize.java
 * Deskripsi : Interface untuk melakukan resize pada objek
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 24 Maret 2025
 */

 public interface IResize {
    // Menambah ukuran menjadi 10% lebih besar
    void zoomIn();

    // Mengurangi ukuran menjadi 10% lebih kecil
    void zoomOut();

    // Menskalakan ukuran sesuai dengan input persen yang diberikan
    void zoom(int percent);
}
