import java.util.Scanner;
public class Days036 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nomor peserta :");
        int no = in.nextInt();

        int NUG = no%2;

        if (NUG == 0) {
            System.out.println("Nomor peserta adalah bilangan Genap");
        }else
            System.out.println("Nomor peserta adalah bilangan Ganjil");

        in.close();
    }
}
