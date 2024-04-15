import java.util.ArrayList;
import java.util.Scanner;

class Buku {
    String judul;
    String pengarang;
    int tahunTerbit;

    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }
}

public class Perpustakaan {
    static ArrayList<Buku> daftarBuku = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean berjalan = true;
        while (berjalan) {
            System.out.println("Pilih operasi yang ingin Anda lakukan:");
            System.out.println("1. Tambahkan buku baru");
            System.out.println("2. Tampilkan daftar buku");
            System.out.println("3. Keluar");

            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    tambahBuku();
                    break;
                case 2:
                    tampilkanDaftarBuku();
                    break;
                case 3:
                    berjalan = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
        input.close();
    }

    public static void tambahBuku() {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan judul buku:");
        String judul = input.nextLine();
        System.out.println("Masukkan nama pengarang:");
        String pengarang = input.nextLine();
        System.out.println("Masukkan tahun terbit:");
        int tahun = input.nextInt();

        Buku bukuBaru = new Buku(judul, pengarang, tahun);
        daftarBuku.add(bukuBaru);

        System.out.println("Buku berhasil ditambahkan.");
    }

    public static void tampilkanDaftarBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Tidak ada buku dalam daftar.");
        } else {
            System.out.println("Daftar Buku:");
            for (int i = 0; i < daftarBuku.size(); i++) {
                System.out.println("Buku ke-" + (i + 1) + ":");
                System.out.println("Judul: " + daftarBuku.get(i).judul);
                System.out.println("Pengarang: " + daftarBuku.get(i).pengarang);
                System.out.println("Tahun Terbit: " + daftarBuku.get(i).tahunTerbit);
                System.out.println();
            }
        }
    }
}
