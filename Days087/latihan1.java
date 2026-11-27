package Days087;

import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa :");
        int mhs = in.nextInt(); 

        if (mhs <= 0) {
            System.out.println("Jumlah data harus lebih dari 0.");
        }else{}

        int[] nilai = new int[mhs];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1)+": ");

            nilai[i] = in.nextInt();
        }

        System.out.println("Data sebelum diubah :");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i]+ " ");
        }
        System.out.println();
        System.out.print("Masukkan indeks yang ingin diubah :");

        int index = in.nextInt();

        if (index >= 0 &&  index < nilai.length) {
            System.out.print("Masukkan nilai baru :");
            nilai[index] = in.nextInt();

            System.out.println("Data setelah diubah :");
            for (int i = 0; i < nilai.length; i++) {
                System.out.print(nilai[i]+ " ");
            }
        }else{
            System.out.println("Indeks tidak valid.");
        }
    }
}
