import java.util.Scanner;

public class Days051 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        int T = in.nextInt();
        for (int B = 1; B <=T; B++) {
            for (int A = 1; A <= B; A++) {
                System.out.print(A + " ");
            } 
            System.out.println();
        }
        in.close();
    }
}

