import java.util.Scanner;

public class CekAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka: ");
        int angka = input.nextInt();

        if (angka > 0) {
            System.out.println("Angka adalah positif");
        } else if (angka < 0) {
            System.out.println("Angka adalah negatif");
        } else {
            System.out.println("Angka adalah nol");
        }
    }
}
