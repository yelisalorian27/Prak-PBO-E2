/* Nama File : Vehicle.java
 * Deskripsi : Kelas dasar untuk kendaraan, berisi metode untuk menghitung harga sewa
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 27 April 2025
 */

public class Vehicle {
    void calRent(int distance, float price) {
        float fare = distance * price;
        System.out.println("vehicle price = " + fare);
    }

    public static void hitungSewa(Vehicle v) {
        v.calRent(50, 1000);
    }
    
}
