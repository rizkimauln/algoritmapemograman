import java.util.Scanner;

public class BentukSegitiga {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("===Program Segitiga Bintang===");
    System.out.print("Masukan Tinggi Segitiga : ");
    int t = input.nextInt();

    for (int i = 1; i <= t; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println(" ");
    }
  }
}