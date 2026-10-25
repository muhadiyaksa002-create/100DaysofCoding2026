import java.util.Scanner;
public class Days054 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int L = in.nextInt();
        int N = 0;

        for (int A = 2;A<=L; A+=2) {
            N+=A;
        }
        System.out.println(N);
        in.close();
    }
}


