import java.util.Scanner;
public class Days058 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int  N = in.nextInt();

         for (int i = N; i >=1; i--) 
            if (i %2 != 0){
                System.out.print(i);
            }
            System.out.print(" ");
        for (int i = N; i >=1; i--) {
                if (i %2 == 0){
                System.out.print(i);
            }
        }
        in.close();
    }
}
