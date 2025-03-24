/* Nama File : MainBD.java  
 * Deskripsi : Program utama untuk pengujian bangun datar dan interface IResize  
 * Pembuat   : Yelisa Lorian  
 * Tanggal   : 24 Maret 2025  
 */  

 public class MainBD {
    public static void main(String[] args) {
        BangunDatar P1 = new Persegi(10, "Biru", "Tebal");
        Persegi P2 = new Persegi(5, "Kuning", "Tipis");
        BangunDatar L1 = new Lingkaran(7, "Merah", "Tebal");
        Lingkaran L2 = new Lingkaran(14, "Hijau", "Tipis");

        System.out.println("===== SEBELUM RESIZE =====");
        P1.printInfo();
        L1.printInfo();
        System.out.println();

        // Melakukan resize dengan interface IResize
        if (P1 instanceof IResize) ((IResize) P1).zoomIn();
        if (L1 instanceof IResize) ((IResize) L1).zoom(20);

        System.out.println("===== SETELAH RESIZE =====");
        P1.printInfo();
        L1.printInfo();
        System.out.println();

        // Uji coba zoom dengan ukuran berbeda
        P2.zoom(50);
        L2.zoomOut();
        System.out.println("===== TEST ZOOM =====");
        P2.printInfo();
        L2.printInfo();
    }
}


