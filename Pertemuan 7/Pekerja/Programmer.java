/* Nama File : Programmer.java
 * Deskripsi : Definisi class Programmer sebagai turunan dari Pegawai dengan tambahan atribut bonus
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 27 April 2025
 */

public class Programmer extends Pegawai {
    private int bonus = 450000;
    
    public Programmer(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
        System.out.println("Bonus : " + bonus);
    }
}
