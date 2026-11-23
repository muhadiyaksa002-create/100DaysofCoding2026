package Days083;

import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang :");
        int B = in.nextInt();

        int[] barang = new int[B];

        for (int i = 0; i < barang.length; i++) {
            System.out.print("Masukkan harga barang ke-" + (i + 1) + ": ");
             barang[i] = in.nextInt();
        }
        int mahal = barang[0];

        for (int i = 0; i < barang.length; i++) {
            if (barang[i] > mahal){
                mahal = barang[i];
            }
        }
        System.out.println("Harga barang termahal :" + mahal);

    }
}
