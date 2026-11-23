package Days083;

import java.util.Scanner;

public  class latihan1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         System.out.print("Masukkan jumlah data :");
         int A = in.nextInt();

         int[] angka = new int[A];

         for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan nilai ke-" + ( i + 1) + ": ");
            angka[i] = in.nextInt();
         }
        int tinggi = angka[0];

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] > tinggi) {
                tinggi = angka[i];
            }
        }
        System.out.println("Nilai tertinggi :" + tinggi);
    }
}
