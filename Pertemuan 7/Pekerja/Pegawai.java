/* Nama File : Pegawai.java
 * Deskripsi : Definisi class induk Pegawai dengan atribut nama dan gaji pokok
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 27 April 2025
 */

public class Pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;
    
    //method
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}