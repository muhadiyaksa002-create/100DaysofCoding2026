import java.util.Scanner;

public class Days064 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int H = 1;
        for (int i = 1; i <=N; i++) {
            H*=i;
        }
        System.out.println(H);
      in.close();
    }
}
