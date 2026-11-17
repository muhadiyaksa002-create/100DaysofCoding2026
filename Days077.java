import java.util.Scanner;

public class Days077 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap\t:");
        String a = in.nextLine();
        System.out.print("Konfirmasi nama lengkap\t:");
        String b = in.nextLine();
        System.out.print("Masukkan program studi\t:");
        String c = in.nextLine();
        System.out.print("Masukkan alamat email\t:");
        String d = in.nextLine();
        System.out.println();

        String trim = a.trim();
        System.out.println("Nama Setelah Trim\t:"+trim);
        System.out.println("Jumlah Karakter\t\t:"+trim.length());
        System.out.println("Nama Huruf Kapital\t:"+trim.toUpperCase());
        System.out.println("Nama Huruf Kecil\t:"+trim.toLowerCase());

        String sub = trim.substring(0,3);
        System.out.println("Tiga Karakter Pertama\t:"+sub);

        String rep = trim.replace(" ","_" );
        System.out.println("Nama Setelah Replace\t:"+rep);

        System.out.println();
        System.out.println("Nama Kosong\t\t:"+ a.isEmpty());
        System.out.println("Konfirmasi Nama Sesuai\t:"+ trim.equals(b));
        System.out.println("Program Studi Sesuai\t:"+c.equalsIgnoreCase("INFORMATIKA"));
        System.out.println("Email Kampus\t\t:"+ d.contains("@kampus.ac.id"));

        in.close();

    }
}
