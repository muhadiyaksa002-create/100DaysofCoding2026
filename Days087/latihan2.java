package Days087;

import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

         System.out.print("Masukkan jumlah barang :");
        int brg = in.nextInt(); 

        if (brg <= 0) {
            System.out.println("Jumlah barang harus lebih dari 0.");
        }else{}

        int[] harga = new int[brg];

        for (int i = 0; i < harga.length; i++) {
            System.out.print("Masukkan harga barang ke-"+ (i+1)+": ");
            harga[i] = in.nextInt();
        }
        for (int i = 0; i < harga.length; i++) {
            harga[i] = harga[i] + 5000;
        }
        System.out.println("Harga setelah ditambahkan Rp5.000 :");   
        for (int i = 0; i < harga.length; i++) {
            System.out.print(harga[i]+ " ");
        }
       
    }
}
