/* Nama File : Asersi1.java
* Deskripsi : program untuk menunjukkan asersi
* Pembuat : Yelisa Lorian
* Tanggal : 6 Maret 2025
*/

public class Asersi1{
    public static void main(String[] args) {
        int x=5;
        if(x>0){
            System.out.println("x bilangan positif");
        }else {
            assert(x<0) :"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}

