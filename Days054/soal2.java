import java.util.Scanner;
public class Lanjutan54 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        for (int P =1; P<=10; P++) {
            System.out.println(N*P);
        }
        in.close();
    }
}
