package Evaluasi3;

import java.util.Scanner;

public class soal11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka basis (m) :");
        int m = in.nextInt();
        System.out.print("Masukkan angka basis (n) :");
        int n = in.nextInt();
        int hasil = 1;

        for (int i = 1; i <=n; i++) {
            hasil *=m;
        }
        System.out.print("hasil "+m +" pangkat "+n +" = "+ hasil);
    }
}
