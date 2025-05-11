/**
 * File : Koleksi.java
 * Deskripsi : merepresentasikan koleksi objek generik
 * Pembuat : Yelisa Lorian
 * Tanggal: 11 Mei 2025
 **/

 public class Koleksi<T> {
    private int nbelm;
    private Object[] wadah;
    
    public Koleksi(int ukuran) {
        this.nbelm = 0;
        this.wadah = new Object[ukuran];
    }
    
    @SuppressWarnings("unchecked")
    public T getIsi(int indeks) {
        if (indeks < 0 || indeks >= nbelm) {
            return null;
        }
        return (T) wadah[indeks];
    }
    
    public void setIsi(int indeks, T nilai) {
        if (indeks >= 0 && indeks < nbelm) {
            wadah[indeks] = nilai;
        }
    }
    
    public int getSize() {
        return nbelm;
    }
    
    public void setSize(int size) {
        if (size >= 0 && size <= wadah.length) {
            this.nbelm = size;
        }
    }
    
    public boolean add(T nilai) {
        if (nbelm < wadah.length) {
            wadah[nbelm] = nilai;
            nbelm++;
            return true;
        }
        return false;
    }
    
    public boolean delete(int indeks) {
        if (indeks < 0 || indeks >= nbelm) {
            return false;
        }
        
        for (int i = indeks; i < nbelm - 1; i++) {
            wadah[i] = wadah[i + 1];
        }
        
        nbelm--;
        return true;
    }
    
    public void showAll() {
        System.out.println("Isi koleksi:");
        for (int i = 0; i < nbelm; i++) {
            System.out.println("[" + i + "] = " + wadah[i]);
        }
        System.out.println("Jumlah elemen: " + nbelm);
    }
}
