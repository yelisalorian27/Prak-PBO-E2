/**
 * File: LambdaList.java
 * Deskripsi: Implementasi lambda pada List, digunakan sebagai parameter pada method.
 * Pembuat: Yelisa Lorian
 * Tanggal: 5 Juni 2025
 */

import java.util.HashMap;
import java.util.Map;

public class LatihanLambda {
    public static void main(String[] args){
        // Membuat Map dengan NIM sebagai key dan nama mahasiswa sebagai value
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060123130082", "Yelisa Lorian");
        mahasiswaMap.put("24060123140157", "Meghan Carson");
        mahasiswaMap.put("24060123120019", "Refine Maryl");
        mahasiswaMap.put("24060123120025", "Venita Jeanette");
        
        System.out.println("=== DAFTAR MAHASISWA ===");
        System.out.println("NIM\t\tNama Mahasiswa");

        // Menggunakan lambda expression untuk menampilkan key dan value
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println(nim + "\t" + nama);
        });
    }
}
