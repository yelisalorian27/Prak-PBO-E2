/* Nama File : TestPolimorfisme.java
 * Deskripsi : Program utama untuk mendemonstrasikan konsep polimorfisme menggunakan class Pegawai, Programmer, dan Manajer
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 27 April 2025
 */

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");
        
        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);
        
        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}
// jelaskan manfaaat polimorfisme

/* Polimorfisme memungkinkan objek dari kelas turunan (Programmer dan Manager) 
untuk diperlakukan sebagai objek dari kelas induk (Pegawai).

Manfaatnya di kasus ini adalah:

1. Kode lebih sederhana dan fleksibel, karena kita bisa menggunakan satu ArrayList<Pegawai> 
untuk menyimpan semua jenis pegawai tanpa perlu membuat list terpisah untuk Manager dan Programmer.

2. Kemudahan dalam pengelolaan objek, cukup dengan memanggil tampilData() dari objek Pegawai, 
tanpa harus tahu apakah objek tersebut Manager atau Programmer, 
karena masing-masing akan otomatis menjalankan metode yang sesuai (overriding).

3. Mempermudah pengembangan, jika di masa depan ingin menambah jenis pegawai lain, 
kita tidak perlu mengubah banyak kode yang sudah ada.
*/ 

// Apabila pada main program perlu menambahkan pegawai4 dan pegawai5! 
// Apa permasalahan yang muncul jika diterapkan tanpa polimorfisme (inclusion)?

/* Jika tanpa polimorfisme, maka:

1. Kita perlu membuat variabel baru untuk setiap jenis pegawai, 
misalnya Manager atau Programmer tidak bisa disimpan dalam satu list Pegawai.

2. Harus melakukan pengecekan tipe objek satu per satu (misalnya dengan instanceof) 
sebelum memanggil metode yang sesuai, yang membuat kode menjadi panjang, rumit, dan sulit dirawat.

3. Menyulitkan perluasan program, karena setiap ada jenis pegawai baru, struktur program utama harus banyak diubah.

Singkatnya, tanpa polimorfisme, program menjadi lebih ribet, tidak fleksibel, dan susah dikembangkan.
*/ 
