import java.util.Scanner;
public class Days031 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //operator logika AND,OR,NOT 
        System.out.print("Masukkan umur :");
        int U = in.nextInt();
        
        System.out.print("Masukkan Nilai tugas :");
        int NT = in.nextInt();
        
        System.out.print("Apakah sudah terdaftar? :");
        boolean T = in.nextBoolean();
        in.nextLine();

        System.out.println("Memenuhi semua syarat :" + (U>=17 && NT>=75 && T ));
        System.out.println("Memenuhi salah satu syarat :" + (U>=17 || NT>=75 || T ));
        System.out.println("Memenuhi salah satu syarat :" + (!T));

        in.close();
    }
}
