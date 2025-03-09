public class Titik {
    /*          ATRIBUT          */
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /*          METHOD           */
    // Konstruktor untuk membuat titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // Konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    void printCounterTitik(){
        System.out.println(this.counterTitik);
    }

    // Mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    // Mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    // mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + x;
    }

    // mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    int getKuadran(){
        if (absis > 0 && ordinat > 0){
            return 1;
        }
        else if (absis < 0 && ordinat > 0){
            return 2;
        }
        else if (absis < 0 && ordinat < 0){
            return 3;
        }
        else if (absis > 0 && ordinat < 0){
            return 4;
        }
        else{
            return 0;
        }
    }

    double getJarakPusat(){
        return Math.sqrt(Math.pow(this.absis,2) + Math.pow(this.ordinat,2));
    }

    void refleksiX(){
        ordinat = -1 * ordinat;
    }

    void refleksiY(){
        absis = -1 * absis;
    }

    Titik getRefleksiX(){
        Titik t = new Titik(this.absis, -(this.ordinat));
        return t;
    }

    Titik getRefleksiY(){
        Titik t = new Titik(-(this.absis), this.ordinat);
        return t;
    }
}   // end class Titik

