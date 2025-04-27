/* Nama File : Student.java
 * Deskripsi : Definisi class Student sebagai turunan dari Person dan override metode isAsleep
 * Pembuat   : Yelisa Lorian
 * Tanggal   : 27 April 2025
 */

public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    public boolean isAsleep( int hr ) { // override
        return 2 < hr && 8 > hr;
    }
}

