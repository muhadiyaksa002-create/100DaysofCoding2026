package Days085;

import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah Barang :");
        int data = in.nextInt();

        int[] angka = new int[data] ;

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan Harga Barang ke-"+ (i + 1) + ": ");
            angka[i] = in.nextInt();
        }
         int murah = angka[0];

         for (int i = 1; i < angka.length; i++) {
            if (angka[i] < murah) {
                murah = angka[i];
            }
        }
        System.out.println("Harga barang termurah: "+ murah);
    }
}

