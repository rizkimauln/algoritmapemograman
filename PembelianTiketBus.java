import java.util.Scanner;

public class PembelianTiketBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahTiket;
        double hargaTiket = 45000;
        double totalHarga;
        
        System.out.println("Selamat datang di Sistem Pembelian Tiket Bus");
        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        jumlahTiket = scanner.nextInt();

        totalHarga = jumlahTiket * hargaTiket;

        System.out.println("Total harga untuk " + jumlahTiket + " tiket bus adalah: Rp" + totalHarga);

        System.out.print("Masukkan jumlah uang yang diberikan: ");
        double uangDiberikan = scanner.nextDouble();

        if (uangDiberikan >= totalHarga) {
            double kembalian = uangDiberikan - totalHarga;
            System.out.println("Kembalian: Rp" + kembalian);
            System.out.println("Terima kasih telah membeli tiket bus.");
        } else {
            System.out.println("Uang tidak cukup untuk melakukan transaksi.");
        }

        scanner.close();
    }
}
