package Days086;

import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.print("Masukkan jumlah barang :");
        int B = in.nextInt();
        in.nextLine();
        
        if (B <= 0){
        System.out.println("Jumlah barang harus lebih dari 0.");
        }else{}
        
        int[] barang =  new int[B];


        for (int i = 0; i < barang.length; i++) {
            System.out.print("Masukkan nomor barang ke-"+ (i+1)+ ": ");

            barang[i] = in.nextInt();
        }
        
        System.out.print("Masukkan nomor barang yang dicari :");
        int src = in.nextInt();
        boolean Ke = false;

        for (int i = 0; i < barang.length; i++) {
            if (barang[i]  == src) {
                Ke = true;
                break;
            }
        }
        if (Ke) {
            System.out.println("Nomor barang " + src + " ditemukan");
        }else{
            System.out.println("Nomor barang  " + src + " Tidak ditemukan");
            
        }
    }
}
