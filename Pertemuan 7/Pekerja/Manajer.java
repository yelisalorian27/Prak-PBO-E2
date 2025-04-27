/* Nama File : Manajer.java
 * Deskripsi : Definisi class Manajer sebagai turunan dari Pegawai dengan tambahan atribut tunjangan
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 27 April 2025
 */

public class Manajer extends Pegawai {
    private int tunjangan = 700000;
    
    public Manajer(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
        System.out.println("Tunjangan : " + tunjangan);
    }
}
