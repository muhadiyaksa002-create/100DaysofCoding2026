import java.util.Scanner;

public class Days076 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap :");
        String nama = in.nextLine();
        System.out.println();

        System.out.println("Nama Awal :  "+ nama);
        String a = nama.trim();
        System.out.println("Nama Setelah Trim :" + a);
        String b = nama.substring(0,3);
        System.out.println("Tiga Karakter Pertama:" + b);
        String c = nama.replace(" ", "_");
        System.out.println("Nama Setelah Replace :" + c);

        in.close();
    }   
}
