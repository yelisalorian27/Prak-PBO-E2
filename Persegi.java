/* Nama File : Persegi.java
 * Deskripsi : Kelas untuk menghitung properti persegi
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 19 Maret 2025
 */

public class Persegi extends BangunDatar {
    private double sisi;
    
    public Persegi() {
        setJmlSisi(4);
    }
    
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }
    
    public double getSisi() {
        return sisi;
    }
    
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    public double getLuas() {
        return sisi * sisi;
    }
    
    public double getKeliling() {
        return sisi * 4;
    }
    
    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        
        System.out.println("Sisi : " + sisi);
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
        System.out.println("Diagonal : " + getDiagonal());
    }
}
