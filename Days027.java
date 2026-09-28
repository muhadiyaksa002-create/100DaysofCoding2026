import java.util.Scanner;
public class Days027 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        System.out.print("Masukkan nilai pertama :");
        int N1 = in.nextInt();
        
        System.out.print("Masukkan nilai ke dua :");
        int N2 = in.nextInt();
      
        // operator sama dengan "==" dan operator tidak sama dengan "!="
        System.out.println("Nilai pertama sama dengan nilai kedua :" + (N1==N2));
        System.out.println("Nilai pertama berbeda dengan nilai kedua :" + (N1!=N2));
        
        in.close();
    }
}
