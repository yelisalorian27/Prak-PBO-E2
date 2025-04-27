/* Nama File : Sewa.java
 * Deskripsi : Program utama untuk mendemonstrasikan konsep polimorfisme menggunakan kelas Vehicle, Car, dan Bus
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 27 April 2025
 */

public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();    
        Vehicle bis = new Bus();      

        kendaraan.calRent(50, 1000); 
        mobil.calRent(50, 1000);      
        bis.calRent(50, 1000);     
        
        System.out.println();
        Vehicle.hitungSewa(kendaraan);
        Vehicle.hitungSewa(bis);
        Vehicle.hitungSewa(mobil);
    }
}

// Analisis Keuntungan Penggunaan Teknik Polimorfisme Inclusion
/* Pada kode program yang menggunakan method hitungSewa(Vehicle v), 
teknik polimorfisme inclusion memberikan beberapa keuntungan penting, yaitu:

1. Fleksibilitas
Method hitungSewa cukup menerima parameter bertipe Vehicle, 
sehingga dapat dipanggil untuk semua objek yang merupakan turunan dari Vehicle (seperti Car dan Bus). 
Kita tidak perlu membuat method terpisah untuk masing-masing tipe kendaraan.

2. Kemudahan Maintenance dan Pengembangan
Jika di kemudian hari ditambahkan tipe kendaraan baru (misalnya Motor, Sepeda, dan lain-lain), 
method hitungSewa tetap dapat digunakan tanpa perlu diubah. 
Cukup buat subclass baru yang mewarisi dari Vehicle, dan override method calRent jika perlu.

3. Dynamic Dispatch
Saat method calRent dipanggil melalui referensi bertipe Vehicle, yang dieksekusi adalah method sesuai tipe objek aslinya.

 - Jika objek bertipe Car, maka method calRent milik Car yang akan dieksekusi.

 - Jika objek bertipe Bus, dan Bus tidak mengoverride calRent, maka method calRent milik Vehicle yang akan dipanggil.

4. Kode Lebih Sederhana dan Terbaca
Dengan menggunakan polimorfisme, kode menjadi lebih ringkas dan rapi, 
tanpa memerlukan banyak if-else atau instanceof untuk mengecek tipe objek. 
Hal ini meningkatkan keterbacaan serta memudahkan debugging dan perawatan kode.

*/ 

