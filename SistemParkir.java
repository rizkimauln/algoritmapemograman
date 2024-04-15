import java.util.Scanner;

public class SistemParkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jamMasuk, jamKeluar, durasi, biayaParkir;
        final int TARIF_PER_JAM = 5000;

        System.out.println("Selamat datang di Sistem Parkir Sederhana");
        System.out.print("Masukkan jam masuk (format 24 jam): ");
        jamMasuk = scanner.nextInt();
        System.out.print("Masukkan jam keluar (format 24 jam): ");
        jamKeluar = scanner.nextInt();

        if (jamKeluar >= jamMasuk) {
            durasi = jamKeluar - jamMasuk;
        } else {
            // Jika parkir melewati tengah malam
            durasi = (24 - jamMasuk) + jamKeluar;
        }

        // Hitung biaya parkir
        biayaParkir = durasi * TARIF_PER_JAM;

        System.out.println("Durasi parkir: " + durasi + " jam");
        System.out.println("Biaya parkir: Rp" + biayaParkir);

        scanner.close();
    }
}
