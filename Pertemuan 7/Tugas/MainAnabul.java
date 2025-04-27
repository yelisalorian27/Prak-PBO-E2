/* Nama File : MainAnabul.java
 * Deskripsi : Program utama untuk mendemonstrasikan polimorfisme pada anabul (hewan peliharaan)
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 27 April 2025
 */

import java.util.ArrayList;

public class MainAnabul {
    public static void main(String[] args) {
        ArrayList<Anabul> anabuls = new ArrayList<>();
        
        anabuls.add(new Kucing("Coco"));
        anabuls.add(new Anjing("Snow"));
        anabuls.add(new Burung("Elang"));

        for (Anabul a : anabuls) {
            a.gerak();
            a.bersuara();
            System.out.println();
        }
    }
}
