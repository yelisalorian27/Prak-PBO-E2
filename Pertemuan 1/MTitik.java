/* Nama File : Titik.java
* Deskripsi : berisi pembuatan objek Titik dan pemanggilan metode utama 
* Pembuat : Yelisa Lorian
* Tanggal : 20 Februari 2024
*/

public class MTitik {
    public static void main(String[] args) {
        // Membuat objek titik
        Titik t1 = new Titik(); // Titik (0,0)
        Titik t2 = new Titik(3, 4); // Titik (3,4)

        // Menampilkan jumlah objek Titik yang telah dibuat
        System.out.println("Jumlah Titik: " + Titik.getCounterTitik());

        // Menampilkan koordinat titik
        System.out.print("Koordinat t1: ");
        t1.printTitik();
        System.out.print("Koordinat t2: ");
        t2.printTitik();

        // Menggeser titik t2 sejauh (2, -1)
        t2.geser(2, -1);
        System.out.print("Koordinat t2 setelah digeser: ");
        t2.printTitik();

        // Menampilkan kuadran titik t2
        System.out.println("Kuadran t2: " + t2.getKuadran());

        // Menampilkan jarak t2 ke pusat (0,0)
        System.out.println("Jarak t2 ke pusat: " + t2.getJarakPusat());

        // Refleksi titik terhadap sumbu X dan Y
        t2.refleksiX();
        System.out.print("Koordinat t2 setelah refleksi terhadap sumbu X: ");
        t2.printTitik();

        t2.refleksiY();
        System.out.print("Koordinat t2 setelah refleksi terhadap sumbu Y: ");
        t2.printTitik();

        // Mendapatkan titik refleksi baru tanpa mengubah titik asli
        Titik refleksiX = t2.getRefleksiX();
        System.out.print("Koordinat refleksi t2 terhadap sumbu X: ");
        refleksiX.printTitik();

        Titik refleksiY = t2.getRefleksiY();
        System.out.print("Koordinat refleksi t2 terhadap sumbu Y: ");
        refleksiY.printTitik();
    }
}

