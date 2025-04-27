/* Nama File : Car.java
 * Deskripsi : Kelas turunan dari Vehicle yang merepresentasikan mobil dan override metode calRent
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 27 April 2025
 */

public class Car extends Vehicle {
    void calRent(int jarak, float harga) {
        float fare = jarak * harga;
        fare = fare - 100.0f;
        System.out.println("Harga sewa mobil = " + fare);
    }
}
