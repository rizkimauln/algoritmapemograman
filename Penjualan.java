import java.util.Scanner;

public class Penjualan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang yang akan dibeli : ");
        int jumlahBarang = input.nextInt();

        String[] namaBarang = new String[jumlahBarang];
        double[] hargaBarang = new double[jumlahBarang];
        int[] jumlahBeli = new int[jumlahBarang];

        for (int i = 0; i < jumlahBarang; i++) {
            System.out.print("Masukkan nama barang ke -" + (i + 1) + " : ");
            namaBarang[i] = input.next();

            System.out.print("Masukkan harga " + namaBarang[i] + " : ");
            hargaBarang[i] = input.nextDouble();

            System.out.print("Masukkan jumlah " + namaBarang[i] + " yang akan dibeli : ");
            jumlahBeli[i] = input.nextInt();
        }

        double totalHarga = 0;
        for (int i = 0; i < jumlahBarang; i++) {
            totalHarga += hargaBarang[i] * jumlahBeli[i];
        }

        System.out.println(" ");
        System.out.println("=====DAFTAR BARANG YANG DIBELI");
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println("Nama Barang       : " + namaBarang[i]);
            System.out.println("Harga             : Rp. " + hargaBarang[i]);
            System.out.println("Jumlah yang Dibeli: " + jumlahBeli[i]);
            System.out.println("Total             : Rp. " + (hargaBarang[i] * jumlahBeli[i]));
            System.out.println();
        }

        System.out.println("Total Harga: Rp. " + totalHarga);

        System.out.println("Pilih metode pembayaran:");
        System.out.println("1. Bayar Tunai");
        System.out.println("2. Kartu Kredit");
        System.out.print("Pilihan: ");
        int metodePembayaran = input.nextInt();

        switch (metodePembayaran) {
            case 1:
                System.out.println("Pembayaran tunai. Terima kasih!");
                break;
            case 2:
                System.out.print("Masukkan nomor kartu kredit: ");
                long nomorKartuKredit = input.nextLong();
                System.out.println("Pembayaran dengan kartu kredit (" + nomorKartuKredit + "). Terima kasih!");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}
