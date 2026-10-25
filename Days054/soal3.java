import java.util.Scanner;
public class lanjutan054 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int number = 0;

        for (int hasil = 1; hasil <N; hasil++) {
            if (N%hasil==0){
                number+=hasil;
            }
        }
        if (number==N){
            System.out.println("perfect number");
        }else{
            System.out.println("not a perfect number");
        }
        in.close();
    }
}
