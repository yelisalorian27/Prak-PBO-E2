/**
 * Nama File    : BangunDatarGeneric.java
 * Deskripsi    : Kelas konstruksi untuk generic bangun datar
 * Pembuat      : Yelisa Lorian
 * Tanggal      : Kamis, 1 Mei 2025
 */

 public class BangunDatarGeneric<T extends BangunDatar>{
    private T bangunDatar;

    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T get (){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}