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
 * File : Segitiga.java
 * Deskripsi : implementasi segitiga sebagai bangun datar
 */

public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisi1;
    private double sisi2;

    public Segitiga(double alas, double tinggi, double sisi1, double sisi2) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    public double hitungKeliling() {
        return alas + sisi1 + sisi2;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}