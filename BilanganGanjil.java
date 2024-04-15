import java.util.Scanner;

public class BilanganGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("MASUKAN JUMLAH DERET : ");
        int n = input.nextInt();
        System.out.println("Bilangan Ganjil Dari 1-" + n + " Adalah: ");

        for (int i = 1; i <= n; i = i + 2) {
            System.out.println(i);
        }
    }
}