/* Nama File : AngkaSialException.java
* Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
* Pembuat : Yelisa Lorian
* Tanggal : 6 Maret 2025
*/

public class AngkaSial {
    public void cobaAngka (int angka) throws AngkaSialException {
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[]args){
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch(AngkaSialException ase){
            //method getMessage () telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka !!!");
        }
    }
}
/* Baris 12 tidak akan dieksekusi jika angka yang dimasukkan adalah 13.
Hal ini karena ketika angka == 13, eksepsi AngkaSialException dilempar (throw new AngkaSialException(); pada baris 10).
Begitu eksepsi dilempar, eksekusi metode cobaAngka() langsung dihentikan 
dan dikembalikan ke blok catch tanpa menjalankan baris 12.
 * 
 */

 /*  
  * Baris 21 tidak akan dieksekusi karena baris 21 adalah as.cobaAngka(12);, 
  yang berada setelah pemanggilan as.cobaAngka(13);.
Ketika as.cobaAngka(13); dieksekusi, eksepsi terjadi, 
sehingga program langsung lompat ke blok catch, melewati baris 21.
Dengan kata lain, setelah eksepsi terjadi, kode setelah pemanggilan yang 
menyebabkan eksepsi tidak akan dijalankan.
 */
