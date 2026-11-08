import java.util.Scanner;

public class Days068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int L = in.nextInt();
        int P = in.nextInt();

        for (int i = 1; i <=L; i++) {
            for (int j = 1; j <=P; j++) {
                System.out.print("* ");
            }
        System.out.println();
        }
    in.close();
    }
}

