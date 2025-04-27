/* Nama File : Coercion.java
 * Deskripsi : Program demonstrasi coercion (konversi tipe data otomatis dan casting eksplisit) pada Java
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 27 April 2025
 */

public class Coercion{
    public static void main(String[] args) {
        // Program nomor 1. char to int (implicit coercion) -> BERHASIL
        int output1 = 'a';
        System.out.println(output1);
        // 'a' adalah char tapi dalam Java, tipe char bisa dikonversi secara implisit (coercion) ke int karena char memiliki 
        // representasi numerik (ASCII). 'a' punya nilai ASCII = 97, maka output = 97.

        // Program nomor 2. double to int (explicit casting required) -> ERROR
        double x = 15.5;
        // int output2 = x; 
        // System.out.println(output2); // Error
        // double tidak bisa dikonversi ke int secara otomatis karena potensi kehilangan data desimal. 
        // Harus menggunakan explicit casting, misalnya: int output = (int) x;
        // Pembenaran
        int output2 = (int) x;
        System.out.println("Output 2 (sudah dicasting): " + output2);

        // Program nomor 3. int to double (implicit coercion)
        int y = 25;
        double output3 = y;
        // int ke double adalah widening conversion, jadi bisa otomatis (coercion). Nilai output = 25.0
        System.out.println(output3);

        // program nomor 4. int to char (explicit casting)
        int z = 78;
        char output4 = (char) z;
        // int ke char harus casting eksplisit, karena bisa saja nilai int di luar range char (0–65535). 
        // 78 dalam ASCII adalah karakter N, maka output = 'N'.
        System.out.println(output4);

        // Program nomor 5. char to double (via coercion through int)
        char a = 'a';
        double output5 = a;
        //char bisa di-coerce ke int, lalu int ke double, jadi ini implisit coercion berantai.'a' → 97 → 97.0 
        // Coercion dari char ke double melalui int
        System.out.println(output5);
    }
}