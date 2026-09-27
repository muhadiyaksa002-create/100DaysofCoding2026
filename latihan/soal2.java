import java.util.Scanner;
public class latihan {        
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("masukkan jumlah halaman :");
        int H = in.nextInt();
        
        System.out.print("masukkan Harga :");
        int h = in.nextInt();

        int total = H * h;

        System.out.println("Total Biaya : " + total);
        in.close();
    }
}
