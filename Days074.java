import java.util.Scanner;

public class Days074{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap\t:");
        String a = in.next();
        System.out.print("Konfirmasi nama lengkap\t:");
        String b = in.next();
        System.out.print("Masukkan program studi\t:");
        String c = in.next();
        System.out.print("Masukkan alamat email\t:");
        String d = in.next();
        System.out.println();

        System.out.println("Nama lengkap kosong\t:" + a.isEmpty());
        System.out.println("Konfirmasi nama\t\t:" + b.equals(a));
        System.out.println("Program studi sesuai\t:" + c.equalsIgnoreCase("PTI"));
        System.out.println("Email kampus valid\t:" + d.contains("@gmail.com"));

        in.close(); 
    }
}
