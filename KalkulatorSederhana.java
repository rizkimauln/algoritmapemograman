import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double angkaPertama, angkaKedua;
        System.out.println("Selamat datang di Kalkulator Sederhana");
        System.out.print("Masukkan angka pertama: ");
        angkaPertama = scanner.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        angkaKedua = scanner.nextDouble();

        System.out.println("Pilih operasi yang diinginkan:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Pilihan Anda (1/2/3/4): ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Hasil: " + (angkaPertama + angkaKedua));
                break;
            case 2:
                System.out.println("Hasil: " + (angkaPertama - angkaKedua));
                break;
            case 3:
                System.out.println("Hasil: " + (angkaPertama * angkaKedua));
                break;
            case 4:
                if (angkaKedua != 0) {
                    System.out.println("Hasil: " + (angkaPertama / angkaKedua));
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan");
                }
                break;
            default:
                System.out.println("Error: Pilihan tidak valid");
                break;
        }

        scanner.close();
    }
}
