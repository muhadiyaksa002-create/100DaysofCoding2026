package Evaluasi3;

import java.util.Scanner;

public class soal12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 1234;
        int a;
        int b = 0;
    do {

        b++;
        System.out.print("Masukkan PIN Anda : ");
        a = in.nextInt();
        
        if (a != n) {
        System.out.println("PIN salah, silahkan coba lagi!");

      }
        System.out.println();
      
    } while (a != n && b < 3) ;
    if ( a == n) {
        System.out.println("PIN benar! Selamat datang.");
    } else {
        System.out.println("Anda salah 3 kali. Kartu ATM terblokir.");
    }
    }
}
