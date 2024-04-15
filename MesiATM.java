import java.util.Scanner;

public class MesiATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 100000000;
        int withdraw;
        int deposit;
        char anotherTransaction;
        int pin = 123456;
        int enteredPin;

        System.out.println("Selamat Datang Di ATM ");
        System.out.println("Pilih Bahasa / Choose Language");
        System.out.println("1. Bahasa Indonesia");
        System.out.println("2. English");
        System.out.print("Pilih 1/2: ");
        int languageChoice = input.nextInt();
        input.nextLine();

        System.out.print(languageChoice == 1 ? "Masukkan PIN Anda: " : "Enter your PIN: ");
        enteredPin = input.nextInt();

        if (enteredPin == pin) {
            do {
                System.out.println(languageChoice == 1 ? "1. Tarik Tunai" : "1. Withdraw Money");
                System.out.println(languageChoice == 1 ? "2. Setor Tunai" : "2. Deposit Money");
                System.out.println(languageChoice == 1 ? "3. Cek Saldo" : "3. Check Balance");
                System.out.println(languageChoice == 1 ? "4. Keluar" : "4. Exit");
                System.out
                        .print(languageChoice == 1 ? "Pilih transaksi yang diinginkan: " : "Choose your transaction: ");
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print(
                                languageChoice == 1 ? "Masukkan jumlah penarikan: " : "Enter withdrawal amount: ");
                        withdraw = input.nextInt();
                        if (balance >= withdraw) {
                            balance -= withdraw;
                            System.out.println(
                                    languageChoice == 1 ? "Silakan ambil uang Anda." : "Please take your money.");
                        } else {
                            System.out.println(languageChoice == 1 ? "Saldo tidak cukup." : "Insufficient balance.");
                        }
                        break;
                    case 2:
                        System.out.print(languageChoice == 1 ? "Masukkan jumlah setoran: " : "Enter deposit amount: ");
                        deposit = input.nextInt();
                        balance += deposit;
                        System.out.println(
                                languageChoice == 1 ? "Uang Anda telah disetorkan." : "Your money has been deposited.");
                        break;
                    case 3:
                        System.out.println(languageChoice == 1 ? "Saldo Anda saat ini adalah: " + balance
                                : "Your current balance is: " + balance);
                        break;
                    case 4:
                        System.out.println(languageChoice == 1 ? "Terima kasih telah menggunakan ATM, Silahkan Ambil Kartu Anda."
                                : "Thank you for using the ATM, Please Take Your Card.");
                        System.exit(0);
                    default:
                        System.out.println(languageChoice == 1 ? "Pilihan tidak valid." : "Invalid choice.");
                }

                System.out.print(languageChoice == 1 ? "Apakah Anda ingin melakukan transaksi lain? (y/n): "
                        : "Do you want to make another transaction? (y/n): ");
                anotherTransaction = input.next().charAt(0);
            } while (anotherTransaction == 'y' || anotherTransaction == 'Y');
            if (languageChoice == 1)
                System.out.println("Silahkan Ambil Kartu Anda");
            else
                System.out.println("Please Take Your Card");
        } else {
            System.out.println(languageChoice == 1 ? "PIN yang Anda masukkan salah." : "Incorrect PIN entered.");
        }

        input.close();
    }
}
