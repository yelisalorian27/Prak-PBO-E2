/* Nama File : Asersi2.java
* Deskripsi : program untuk menunjukkan asersi
* Pembuat : Yelisa Lorian
* Tanggal : 6 Maret 2025
*/

//class Lingkaran 
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}
//class Asersi2
public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari>0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}

/* Secara konsep kode diatas kurang tepat, Masalahnya adalah kode tersebut menetapkan jariJari = 0 kemudian langsung melakukan asersi bahwa jariJari > 0, yang akan selalu gagal karena nol tidak lebih besar dari nol.
Asersi tersebut dimaksudkan untuk memvalidasi bahwa radius harus positif, tetapi daripada hanya melemparkan error asersi, pendekatan yang lebih baik adalah:

Menambahkan validasi di dalam konstruktor kelas Lingkaran
Memberikan pesan pengecualian yang bermakna
Menggunakan validasi input yang tepat  */

/* Perbaikan Kode
 * // class Lingkaran
class Lingkaran {
    private double jariJari;
    
    public Lingkaran(double jariJari) {
        // Validasi bahwa jariJari bernilai positif
        if (jariJari <= 0) {
            throw new IllegalArgumentException("Jari-jari harus lebih besar dari nol");
        }
        this.jariJari = jariJari;
    }
    
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        try {
            // Gunakan nilai positif untuk jariJari
            double jariJari = 7.0;
            
            // Validasi input menggunakan assert jika diperlukan
            assert(jariJari > 0) : "Jari-jari tidak boleh nol atau negatif!";
            
            Lingkaran l = new Lingkaran(jariJari);
            double kelilingLingkaran = l.hitungKeliling();
            System.out.println("Keliling lingkaran = " + kelilingLingkaran);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
 */