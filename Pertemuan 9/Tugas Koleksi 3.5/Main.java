/**
 * File : Main.java
 * Deskripsi : main class untuk menguji Koleksi
 * Pembuat : Yelisa Lorian
 * Tanggal: 11 Mei 2025
 **/

 public class Main {
    public static void main(String[] args) {
        Koleksi<Character> huruf = new Koleksi<>(10);

        System.out.println("Memasukkan karakter:");
        for (char c : new char[]{'C', 'H', 'O', 'C', 'O', 'M', 'I', 'N', 'T', 'O'}) {
            huruf.add(c);
        }
        huruf.showAll();

        System.out.println("\nMengganti karakter di indeks 2 dengan 'I':");
        huruf.setIsi(2, 'I');
        huruf.showAll();

        System.out.println("\nMenghapus karakter di indeks 7 :");
        huruf.delete(7);
        huruf.showAll();

        int index = 8;
        System.out.println("\nKarakter di indeks ke-" + index + ": " + huruf.getIsi(index));

        System.out.println("\nMenambahkan karakter baru 'W':");
        boolean berhasil = huruf.add('W');
        System.out.println(berhasil ? "'W' berhasil ditambahkan!" : "Gagal menambahkan 'W', kapasitas penuh.");

        System.out.println("\nMengatur jumlah elemen menjadi 5:");
        huruf.setSize(5);
        huruf.showAll();

        System.out.println("\nMenambahkan karakter 'W' setelah pengaturan ulang:");
        huruf.add('W');
        huruf.showAll();
    }
}