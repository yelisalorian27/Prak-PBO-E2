/* Nama File : Asersi2.java
* Deskripsi : program penggunaan eksepsi menggunakan class library Java
* Pembuat : Yelisa Lorian
* Tanggal : 6 Maret 2025
*/
public class ExceptionOnArray {
    public static void main(String[] args){
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        } finally {
            System.out.println("clean up node...");
        }

    }
}
