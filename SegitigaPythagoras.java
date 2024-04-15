import java.util.Scanner;

public class SegitigaPythagoras {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("SEGITIGA PYTHAGORAS");

        // Input Alas
        System.out.print("ALAS : ");
        int a = input.nextInt();

        // Input Tinggi
        System.out.print("TINGGI : ");
        float t = input.nextFloat();
    	
        // Input Hipotenusa
        double h = (a * a + t * t);
        System.out.println("HIPOTENUSA : " + Math.sqrt(h));

    }
}
