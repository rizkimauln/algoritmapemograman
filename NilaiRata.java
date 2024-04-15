import java.util.Scanner;

public class NilaiRata{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("===Program Rat-Rata Nilai Mahasiswa==");
        System.out.print("Masukan Jumlah Matakuliah : ");
        int j = input.nextInt();
        double t = 0, n;

        for (int i = 1; i <= j; i++){
            System.out.print("Nilai Ke "+i+" = ");
            n =input.nextDouble();
            t += n;
        }
        System.out.println("Rata-Rata Nilai = "+ t/j);
    }
}
