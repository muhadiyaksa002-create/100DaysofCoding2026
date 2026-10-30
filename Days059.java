import java.util.Scanner;

public  class Days059 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        for (int i = M; i <=N; i+=M) {
            System.out.print(i);
            if (i + M <=N){
                System.out.print(" ");
            }
        }
        System.out.println();
    
        in.close();
    }
    
}
