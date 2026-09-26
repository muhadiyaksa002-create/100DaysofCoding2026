import java.util.Scanner;
public class Days025 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final double phi = 3.14;
        System.out.print("masukkan jari :");
        int R = in.nextInt();

        double Luas = phi * (R * R);
        double keliling = 2 * phi * R;

        System.out.println("luas lingkaran :" + Luas);
        System.out.println("keliling lingkaran :" + keliling);

        in.close();
    }
}
