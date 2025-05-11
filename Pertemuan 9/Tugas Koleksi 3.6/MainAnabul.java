/**
 * File : MainAnabul.java
 * Deskripsi : Main class untuk menguji koleksi Anabul
 * Pembuat : Yelisa Lorian
 * Tanggal: 11 Mei 2025
 **/

 import java.util.Random;

 public class MainAnabul {
     public static void main(String[] args) {
         KoleksiAnabul koleksi = new KoleksiAnabul(10);
         Random rand = new Random();
         String[] namaAnabul = {"Keiko", "Choco", "Kiko", "Ayako", "Milo", "Dondon", "Dikun", "Stitch", "Snow", "Boncel"};
 
         for (int i = 0; i < 10; i++) {
             int jenis = rand.nextInt(3); // 0 = Kucing, 1 = Anjing, 2 = Burung
             String nama = namaAnabul[i];
 
             switch (jenis) {
                 case 0:
                     koleksi.tambahAnabul(new Kucing(nama));
                     break;
                 case 1:
                     koleksi.tambahAnabul(new Anjing(nama));
                     break;
                 case 2:
                     koleksi.tambahAnabul(new Burung(nama));
                     break;
             }
         }
 
         koleksi.showAll();
     }
 }