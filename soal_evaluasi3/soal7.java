import java.util.Scanner;

public class soalev3_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== MENU ATM ===");
        System.out.println("1. setor uang");
        System.out.println("2. Tarik Uang");

        System.out.print("pilih menu (1/2) :");
        int m = in.nextInt();
       
        int saldo = 100000;

        if (m == 1){
            System.out.printf("Masukkan Nominal :");
            int N = in.nextInt();
            saldo += N;
            System.out.println("Setor berhasil. Saldo Anda: Rp " +saldo);
        }else if (m==2 ){
            System.out.print("Nominal ditarik :");
            int n = in.nextInt();
        if (saldo >= n){
            saldo -= n;
            System.out.println("tarik berhasil");
        }else {
            System.out.println("Maaf, saldo tidak cukup! Saldo Anda: Rp" + saldo);
        }
    }else{
        System.out.println("Error: Menu tidak valid. Transaksi dibatalkan.");
    }

    in.close();
    }
}
