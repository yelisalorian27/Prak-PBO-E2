/* Nama File    : mahasiswa.java
 * Deskripsi    : Menyimpan informasi terkait mahasiswa
 * Pembuat      : Yelisa Lorian - 24060123130082
 * Tanggal      : 2 Maret 2025
 */


import java.util.ArrayList;
public class mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<matkul>listmatkul;
    private Dosen dosenwali;
    private kendaraan kendaraan;
    
    //konstruktor tanpa parameter
    public mahasiswa(){
        this.nim = " ";
        this.nama = " ";
        this.prodi = " ";
        this.listmatkul = new ArrayList<>();
        this.dosenwali = new Dosen();
        this.kendaraan = new kendaraan();
    }
    
    //konstruktor dengan parameter
    public mahasiswa (String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listmatkul = new ArrayList<>(); 
        this.dosenwali = new Dosen();
        this.kendaraan = new kendaraan();
    }
    
    //selector (getter)
    public String getnim(){
        return nim;
    }
    public String getnama(){
        return nama;
    }
    public String getprodi(){
        return prodi;
    }
    public Dosen getdosenwali(){
        return dosenwali;
    }
    public kendaraan getkendaraan(){
        return kendaraan;
    }
    
    //mutator (setter)
    public void setnim(String nim){
        this.nim = nim;
    }
    public void setnama(String nama){
        this.nama = nama;
    }
    public void setprodi(String prodi){
        this.prodi = prodi;
    }
    public void setdosenwali(Dosen dosenwali){
        this.dosenwali = dosenwali;
    }
    public void setkendaraan(kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }
    
    public void addmatkul (matkul newmatkul){
        listmatkul.add(newmatkul);
    }
    
    public int getjmlsks (){
        int sum = 0;
        for (int i = 0; i < listmatkul.size(); i++){
           sum += listmatkul.get(i).getsks(); 
        }
        return sum;
    }
    
    public int getjumlahmatkul(){
        return listmatkul.size();
    }
    
    public void printmhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }
    
    public void printdetailmhs(){
        printmhs();
        System.out.println("Dosen wali: " + dosenwali.getnama());
        System.out.println("Kendaraan: " + kendaraan.getjenis());
        System.out.println("Mata kuliah yang diambil: ");
        for(matkul mk : listmatkul) {
            System.out.println("- " + mk.getnama() + " (" + mk.getsks() + " SKS)");
        }
        System.out.println("Total SKS: " + getjmlsks());
    }
}
