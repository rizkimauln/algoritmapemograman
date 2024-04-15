import java.util.Scanner;

public class HitungPersegi {

    static int luasPersegi(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi persegi: ");
        int panjangSisi = scanner.nextInt();
        int hasilLuas = luasPersegi(panjangSisi);

        System.out.println("Luas persegi dengan panjang sisi " + panjangSisi + " adalah: " + hasilLuas);
        scanner.close();
    }
}