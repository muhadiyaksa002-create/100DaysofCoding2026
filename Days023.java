import java.util.Scanner;
public class Days023 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("masukkan sisi persegi : ");
        int Sisi = in.nextInt();

        int luas = Sisi * Sisi;
        int keliling = 4 * Sisi;

        System.out.println("Luas persegi :" + luas);
        System.out.println("Keliling persegi :" + keliling);

        in.close();
    }
}
