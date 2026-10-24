import java.util.Scanner;

public class Days053 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       int counter = 0;
       String respon;
        do {
            System.out.print("Masukkan nama menu: ");
            String menu = in.nextLine();
            
            System.out.println("[Pesanan dicatat...] ");
            counter++;

            System.out.print("Pesan lagi (y/t)? ");
            respon =in.nextLine();

        } while (respon.equalsIgnoreCase("y"));
        System.out.println("Pemesanan Selesai! ");
        System.out.println("Total pesanan Anda :" + counter + " menu");

        in.close();
    }
}
