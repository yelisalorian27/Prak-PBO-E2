/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author yelisalorian
 */
/**
 * File : Persegipanjang.java
 * Deskripsi : implementasi persegi panjang sebagai bangundatar
 */

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