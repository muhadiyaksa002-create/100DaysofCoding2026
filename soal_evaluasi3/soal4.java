import java.util.Scanner;

public class soalev3_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Berat emas :");
        double b = in.nextDouble();

        if (b % 1 != 0){
            System.out.println("Bilangan Desimal (Emas Digital) ");
        }else {
            System.out.println("Bilangan Bulat (Emas Fisik)");
        }
        in.close();
    }
}
