import java.util.Scanner;

public class HitungJumlah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka;
        int jumlah = 0;

        System.out.println("Program untuk menghitung jumlah angka.");
        System.out.println("Masukkan angka (0 untuk berhenti):");

        while ((angka = scanner.nextInt()) != 0) {
            jumlah += angka;
            System.out.println("Masukkan angka lain (0 untuk berhenti):");
        }

        System.out.println("Jumlah total adalah: " + jumlah);
        scanner.close();
    }
}
