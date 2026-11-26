package Days086;

import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa :");
        int M = in.nextInt();
        in.nextLine();
        
        if (M <= 0){
            System.out.println("Jumlah data harus lebih dari 0.");
        }else{}
        
        String[] nama =  new String[M];


        for (int i = 0; i < nama.length; i++) {
            System.out.print("Masukkan angka ke-"+ (i+1)+ ": ");

            nama[i] = in.nextLine();
        }
        
        System.out.print("Masukkan nomor barang yang dicari: ");
        String src = in.nextLine();
        boolean Ke = false;

        for (int i = 0; i < nama.length; i++) {
            if (nama[i]  == src) {
                Ke = true;
                break;
            }
        }
        if (Ke) {
            System.out.println("Nama " + src + " ditemukan");
        }else{
            System.out.println("Nama " + src + " Tditemukan");
            
        }
    }
}
