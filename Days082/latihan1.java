package Days82;

import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int J = in.nextInt();

        int[] angka = new int[J];
        int total = 0;

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = in.nextInt();
            total += angka[i];
        }
        System.out.println();
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Angka ke-" + (i + 1) + " : " + angka[i]);
        }
        System.out.println("Total seluruh angka: " + total);
        in.close();
    }
}
