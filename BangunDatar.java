import java.util.Scanner;

public class BangunDatar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("==========PERHITUNGAN LUAS BANGUN DATAR==========");

        System.out.print("1. PERSEGI\n2. SEGITIGA\n3. LINGKARAN\nPILIH BANGUN DATAR 1/2/3: ");
        int BANGUNDATAR = input.nextInt();

        if (BANGUNDATAR == 1){
            System.out.println("RUMUS L = S x S");
            System.out.print("MASUKAN S = ");
            int SISI = input.nextInt();
            System.out.println("L = S x S");
            System.out.println("L = " + SISI + " x " + SISI);
            System.out.println("L = " + SISI * SISI + " CM");

        }else if (BANGUNDATAR == 2){
            System.out.println("RUMUS L = 0.5 x A x T");
            System.out.print("MASUKAN A = ");
            double ALAS = input.nextDouble();
            System.out.print("MASUKAN T = ");
            double TINGGI = input.nextDouble();
            System.out.println("L = 0.5 x A x T");
            System.out.println("L = 0.5 x" + ALAS + " x " + TINGGI);
            System.out.println("L = " + 0.5 * ALAS * TINGGI + " CM");

        }else if (BANGUNDATAR == 3){
            System.out.println("RUMUS L = 3.14 x R x R");
            System.out.print("MASUKAN R = ");
            double R = input.nextDouble();
            System.out.println("L = 3.14 x A x T");
            System.out.println("L = 3.14 x L " + R + " x " + R);
            System.out.println("L = " + 3.14 * R * R + " CM");
        }else {
            System.out.println("Pilihan Tidak Valid");
        }
    }
}
