/* Nama File : Overloading.java
 * Deskripsi : Program demonstrasi konsep overloading pada Java (metode dengan nama sama namun parameter berbeda)
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 27 April 2025
 */

public class Overloading {

        int tambah (int x, int y){
            return x + y;
        }
    
        int tambah (int x, int y, int z){
            return x + y + z;
        }
    
        double tambah (double x, double y){
            return x + y;
        }
    
        double tambah (int y, double x){
            return y + x;
        }
    
        public static void main(String[] args){
            Overloading O = new Overloading();
            System.out.println(O.tambah(1,2));
            System.out.println(O.tambah(1,2,3));
            System.out.println(O.tambah(1,2));
            System.out.println(O.tambah(2,1.0));
        }
}