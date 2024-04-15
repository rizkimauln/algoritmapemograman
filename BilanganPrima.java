import java.util.Scanner;
public class BilanganPrima {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int bil; 
        System.out.print("Masukan Angka Awal: ");
        int awal = input.nextInt();
        System.out.print("Masukan Angka Akhir: ");
        int akhir = input.nextInt();
        System.out.println("Bilangan Prima Dari "+awal+"-"+akhir+" Adalah:");
        
        for (int i=awal; i<=akhir; i++){
            bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil++;
                }
            }
            if (bil==2){
                System.out.print(i+" ");
            }             
        }    
   }
}