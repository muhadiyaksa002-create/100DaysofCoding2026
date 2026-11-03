import java.util.Scanner;

public class Days063 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int M = in.nextInt();
        int N = in.nextInt();
        int H = 1;

        for (int i = 1; i <= N; i++) {
            H *= M;
        }
        System.out.println(H);
    in.close();
    }
}
