package Days82;

import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

         System.out.print("Masukkan jumlah barang: ");
        int J = in.nextInt();

        int[] harga = new int[J];
        int total = 0;

        for (int i = 0; i < harga.length; i++) {
            System.out.print("Masukkan harga barang ke-" + (i + 1) + ": ");
            harga[i] = in.nextInt();
            total += harga[i];
        }
        System.out.println();
        for (int i = 0; i < harga.length; i++) {
            System.out.println("Harga barang ke-" + (i + 1) + " : " + harga[i]);
        }
        System.out.println("Total belanja: " + total);
        in.close();
    }
}
