/* Nama File : BangunDatar.java
 * Deskripsi : Kelas induk untuk berbagai bangun datar
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 19 Maret 2025
 */

public class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;
    
    //konstruktor
    public BangunDatar(){
        counterBangunDatar++;
    }
    
    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }
    //
    
    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar : " +counterBangunDatar);
    }
    
    public int getJmlSisi(){
        return jmlSisi;
    }
    
    public void setJmlSisi (int jmlSisi){
        this.jmlSisi = jmlSisi;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    public String getBorder(){
        return border;
    }
    
    public void setBorder(String border){
        this.border = border;
    }
    
    public void printInfo(){
        System.out.println("Jumlah sisi : " + jmlSisi);
        System.out.println("Warna : " + warna);
        System.out.println("Border : " + border);
    }
}


