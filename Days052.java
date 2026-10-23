import java.util.Scanner;
public class Days052 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      
        boolean good = false;  
        while (!good) {
            System.out.print("Masukkan PIN :");
            int PIN = in.nextInt();
            if (PIN == 123456){
                good = true;
            }else{
                System.out.println("PIN Salah. Silakan coba lagi.");
            }
        }
        System.out.println("PIN Benar. Akses Diberikan.");

        in.close();
    }
}
