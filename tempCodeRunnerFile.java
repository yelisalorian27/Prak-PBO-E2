import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap("954647548", "Andi", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000, "Fakultas Sains dan Matematika", "78647324");
        DosenTamu dosenTamu = new DosenTamu("123456789", "Budi", LocalDate.of(1985, 3, 10), LocalDate.of(2010, 6, 15), 4500000, "Fakultas Teknik", "67894561", LocalDate.of(2026, 12, 31));
        Tendik tendik = new Tendik("987654321", "Siti", LocalDate.of(1988, 7, 20), LocalDate.of(2012, 4, 10), 4000000, "Kemahasiswaan");
        
        System.out.println("=== Info Dosen Tetap ===");
        dosenTetap.printInfo();
        
        System.out.println("\n=== Info Dosen Tamu ===");
        dosenTamu.printInfo();
        
        System.out.println("\n=== Info Tendik ===");
        tendik.printInfo();
    }
}