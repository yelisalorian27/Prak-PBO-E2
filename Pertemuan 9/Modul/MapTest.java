/**
 * File : MapTest.java
 * Deskripsi : Program yang menggunakan Generic untuk pasangan Kunci-Nilai
 * Pembuat : Yelisa Lorian
 * Tanggal: 11 Mei 2025
 **/

 import java.util.HashMap;
import java.util.Map;
import java.util.Set;

 public class MapTest{
     public static void main(String[] args){
         //kunci-> integer, nilai-> string
         Map<Integer,String> map = new HashMap<Integer,String>();
         //menempatkan elemen kunci dan nilai
         map.put(1,"satu");
         map.put(2,"dua");
         //mengambil elemen pertama
         System.out.println(map.get(1));
         //mengambil keseluruhan kunci sebagai objek collection Set
         Set<Integer> key = map.keySet();
     }
 }
