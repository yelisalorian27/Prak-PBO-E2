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
