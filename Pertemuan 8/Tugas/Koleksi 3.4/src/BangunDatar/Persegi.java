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
 * File : Persegi.java
 * Deskripsi : implementasi Persegi sebagai bangundatar
 */

public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi (double sisi){
        this.sisi = sisi;
    }

    public double hitungKeliling (){
        return 4 * sisi;
    }
    
    public double hitungLuas(){
        return sisi * sisi;
    }
}
