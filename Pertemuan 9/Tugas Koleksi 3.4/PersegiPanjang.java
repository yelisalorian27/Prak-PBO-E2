/**
 * File : Persegipanjang.java
 * Deskripsi : implementasi persegi panjang sebagai bangundatar
 * Pembuat : Yelisa Lorian
 * Tanggal: 11 Mei 2025
 **/

 public class PersegiPanjang extends BangunDatar{
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungKeliling(){
        return 2 * (panjang + lebar);
    }

    public double hitungLuas(){
        return panjang * lebar;
    }
}