package evaluasike3;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String A = in.nextLine();
        int B = in.nextInt();

        for (int i = 1; i <=B; i++) {
            System.out.println(A);
        }
    }
}
