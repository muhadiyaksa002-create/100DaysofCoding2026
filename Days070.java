import java.util.Scanner;

public class Days070 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i = N; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
        System.out.println();
        }
    in.close();
    }
}
