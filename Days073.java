import java.util.Scanner;

public class Days073 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap:");
        String Nama = in.next();

        System.out.println("Nama Asli\t:"+ Nama);
        System.out.println("Jumlah Karakter\t:"+ Nama.length());
        System.out.println("Huruf Kapital\t:"+ Nama.toUpperCase());
        System.out.println("Huruf Kecil\t:"+ Nama.toLowerCase());

    in.close();
    }
}
