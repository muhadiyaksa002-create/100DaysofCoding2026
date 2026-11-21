package Days81;

import java.util.Scanner;

public class latihan2 {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Masukkan jumlah nama:");
        int J = in.nextInt();
        in.nextLine();
        String[] nama = new String [J];

        for (int i = 0; i < nama.length; i++) {
            System.out.print("Masukkan nama ke-"+ (i+1)+ ": ");
            nama[i] = in.nextLine();
        }
        System.out.println("Daftra nama:");
        for (int i = 0; i < nama.length; i++) {
            System.out.println(nama[i]);
        }
    in.close();
   } 
}
