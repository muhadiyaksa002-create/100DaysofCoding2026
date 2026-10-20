import java.util.Scanner;
public class Days049 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan total Belanjaan :");
        int Total = in.nextInt();

        String kategori  = (Total >= 500000) ? "Pelanggan VIP" : "Pelanggan Reguler";
        String bonus =  (Total %2 == 0) ? "Voucer Cashback" : "point redward";
        System.out.println("Total belanjaan :" + Total);
        System.out.println("Kategori :" + kategori);
        System.out.println("Bonus :" + bonus);
        }
}
