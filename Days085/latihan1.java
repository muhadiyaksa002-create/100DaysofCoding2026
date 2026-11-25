package Days085;

import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah data :");
        int data = in.nextInt();

        int[] angka = new int[data] ;

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan Nilai ke-"+ (i + 1) + ": ");
            angka[i] = in.nextInt();
        }
         int trendah = angka[0];

         for (int i = 1; i < angka.length; i++) {
            if (angka[i] < trendah) {
                trendah = angka[i];
            }
        }
        System.out.println("Nilai terendah: "+ trendah);
    }
}
