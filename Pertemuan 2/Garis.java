/* Nama File    : Garis.java
 * Deskripsi    : Impelmentasi dari Garis.java
 * Pembuat      : Yelisa Lorian
 * Tanggal      : 23 Febuari 2025
 */

class Garis{
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    Garis(){
        titikAwal = new Titik(0.0, 0.0);
        titikAkhir = new Titik(1.0, 1.0);
        counterGaris++;
    }

    Garis(Titik awal, Titik akhir){
        titikAwal = awal;
        titikAkhir = akhir;
        counterGaris++;
    }

    Titik getTitikAwal(){
        return titikAwal;
    }

    Titik getTitikAkhir(){
        return titikAkhir;
    }

    void setTitikAwal(Titik titik){
        titikAwal = titik;
    }

    void setTitikAkhir(Titik titik){
        titikAkhir = titik;
    }

    static int getCounterGaris(){
        return counterGaris;
    }

    double getPanjang(){
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    double getGradien(){
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return dy / dx;
    }

    Titik getTitikTengah(){
        double midX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double midY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(midX, midY);
    }

    boolean isSejajar(Garis g){
        return Math.abs(this.getGradien() - g.getGradien()) < 0.001;
    }

    boolean isTegakLurus(Garis g){
        return Math.abs(this.getGradien() * g.getGradien() + 1) < 0.001;
    }

    void printGaris(){
        System.out.println("Garis dari titik (" + titikAwal.getAbsis() + "," + titikAwal.getOrdinat() + ") ke (" + titikAkhir.getAbsis() + "," + titikAkhir.getOrdinat() + ")");
    }

    String getPersamaanGaris(){
        double m = getGradien();
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());
        return String.format("y = %.2fx + %.2f", m, c);
    }
}