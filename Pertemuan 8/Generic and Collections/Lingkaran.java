/**
 * Nama File    : BangunDatar.java
 * Deskripsi    : Implementasi Lingkaran untuk class BangunDatar
 * Pembuat      : Yelisa Lorian
 * Tanggal      : Kamis, 1 Mei 2025
 */


 public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran (double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
    
}