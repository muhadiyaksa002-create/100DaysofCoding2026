import java.util.Scanner;

public class Days043 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan bilangan :");
        int B = in.nextInt();

        if (B %3==0 && B %5==0) {
            System.out.println("Kelipatan 3 dan 5 ");
        }else if (B %3==0) {
            System.out.println("Kelipatan 3 ");
        }else if (B %5==0) {
            System.out.println("Kelipatan 5 ");
        }else {
            System.out.println("Bukan kelipatan 3 maupun 5 ");
        }
    in.close();
    }
}
