import java.util.Scanner;

public class Days056 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("");
        int N = in.nextInt();

        for (int i = 1; i <=N; i++) {
            System.out.print(i);
        }
        System.out.println();
        for (int j = N; j >=1; j--) {      
                System.out.print(j);
            }
        in.close();
    }
}
