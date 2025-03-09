/* Nama File    : Dosen.java
 * Deskripsi    : Menyimpan informasi terkait mata kuliah
 * Pembuat      : Yelisa Lorian - 24060123130082
 * Tanggal      : 2 Maret 2025
 */


public class matkul{
    private String idmatkul;
    private String nama;
    private int sks;
    
    //konstruktor tanpa parameter
    public matkul(){
        this.idmatkul = " ";
        this.nama = " ";
        this.sks = 0;
    }
    
    //konstruktor dengan parameter
    public matkul(String idmatkul, String nama, int sks){
        this.idmatkul = idmatkul;
        this.nama = nama;
        this.sks = sks;
    }
    
    //selector (getter)
    public String getidmatkul(){
        return idmatkul;
    }
    
    public String getnama(){
        return nama;
    }
    
    public int getsks(){
        return sks;
    }
    
    //mutator (setter)
    public void setidmatkul(){
        this.idmatkul = idmatkul;
    }
    
    public void setnama(){
        this.nama = nama;
    }
    
    public void setsks(){
        this.sks = sks;
    }
}
