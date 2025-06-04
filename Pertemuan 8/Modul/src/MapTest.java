/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yelisalorian
 */
/**
 * File : MapTest.java
 * Deskripsi : Program yang menggunakan Generic untuk pasangan Kunci-Nilai
 * 
 */

import java.util.*;

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
