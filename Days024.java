import java.util.Scanner;
public class Days024 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("masukkan panjang : ");
        int P = in.nextInt();
        
        System.out.print("masukkan Lebar : ");
        int L = in.nextInt();

        int luas = P * L;
        int keliling = 2 * (P + L);

        System.out.println("Luas persegi panjang :" + luas);
        System.out.println("Keliling persegi panjang :" + keliling);

        in.close();
    }
}
