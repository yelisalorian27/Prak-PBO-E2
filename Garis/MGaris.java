/* Nama File    : MGaris.java
 * Deskripsi    : Impelmentasi dari Garis.java
 * Pembuat      : Yelisa Lorian - 24060123130082
 * Tanggal      : 17 Febuari 2025
 */

 public class MGaris {
    public static void main (String[] args){
        Titik T1 = new Titik(3, -7);
        Titik T2 = new Titik(-2, -3);
        Garis N = new Garis(T1, T2);

        System.out.println("Garis N : ");
        N.printGaris(); 
        System.out.println("-----------------------------------");

        System.out.println("Titik awal Garis N :");
        N.getTitikAwal().printTitik();
        System.out.println("-----------------------------------");

        System.out.println("Titik akhir Garis N :");
        N.getTitikAkhir().printTitik();
        System.out.println("-----------------------------------");

        System.out.println("titik Awal = (-3, 4)");
        Titik Tb1 = new Titik (-3, 4);
        N.setTitikAwal(Tb1);
        N.printGaris();
        System.out.println("-----------------------------------"); 

        System.out.println("Mengubah Titik Akhir menjadi : (6, 2)");
        Titik Tb2 = new Titik (6, 2);
        N.setTitikAkhir(Tb2);
        N.printGaris();
        System.out.println("-----------------------------------");

        System.out.println("Line N length : " + N.getPanjang());
        System.out.println("-----------------------------------");

        System.out.println("Line N gradient : " + N.getGradien());
        System.out.println("-----------------------------------");

        System.out.println("Mid point line N : ");
        N.getTitikTengah().printTitik();
        System.out.println("-----------------------------------");

        //Garis B
        Titik T3 = new Titik (-7, -5);
        Titik T4 = new Titik (8, -2);
        Garis X = new Garis (T3, T4);
        //Garis C
        Titik T5 = new Titik (2, 11);
        Titik T6 = new Titik (-1, 5);
        Garis Y = new Garis(T5, T6);

        System.out.println("Is line N parallel with line X : " + N.isSejajar(X));
        System.out.println("Is line N parallel with line Y : " + N.isSejajar(Y));
        System.out.println("-----------------------------------");

        System.out.println("Is line N perpendicular with line X : " + N.isTegakLurus(X));
        System.out.println("Is line N perpendicular with line Y : " + N.isTegakLurus(Y));
        System.out.println("-----------------------------------");

        //
        Titik T7 = new Titik(-4, 2);
        Titik T8 = new Titik(2, 5);
        Garis Z = new Garis(T7, T8);
        System.out.println("Persamaan Garis D adalah " + Z.getPersamaanGaris());
    }
}
