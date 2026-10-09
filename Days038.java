import java.util.Scanner;

public class Days038 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== MENU WARTEG CYBER 2077 ===");
        System.out.println("1. Nasi Hologram (Rp 15000)");
        System.out.println("2. Ayam Goreng Laser (Rp 20000)");
        System.out.println("3. Es Teh Matrix (Rp 5000)");
        System.out.println("=========================");

        System.out.print("Masukkan nomor pesanan : ");
        int NP = in.nextInt();

        String pesanan = "";
        int harga_perporsi = 0;

        if (NP == 1) {
            pesanan = "Nasi Hologram";
            harga_perporsi = 15000;
        } else if (NP == 2) {
            pesanan = "Ayam Goreng Laser";
            harga_perporsi = 20000;
        } else if (NP == 3) {
            pesanan = "Es Teh Matrix";
            harga_perporsi = 5000;
        } else {
            System.out.println("Waduhhh pesanan yang kamu masukkan tidak ada di menu!!!");
            return;
        }

        System.out.print("Masukkan jumlah porsi : ");
        int JP = in.nextInt();

        System.out.print("Apakah punya Member? (true/false) : ");
        boolean M = in.nextBoolean();

        int totalAwal = harga_perporsi * JP;
        System.out.println();

        System.out.println("Menu : " + pesanan);
        System.out.println("Jumlah : " + JP + " porsi");
        System.out.println("Total Harga Awal : Rp " + totalAwal);

        int promo1 =0;
        int promo2 =0;

        if (totalAwal > 50000) {
            promo1 = totalAwal * 10 / 100;
            System.out.println("Selamat! Anda dapat Diskon Belanja Besar 10% (Potongan Rp " + promo1 + ")");
        }

        if (M == true) {
            promo2 = 5000;
            System.out.println("Diskon Member diterapkan (Potongan Rp 5000)");
        }

        System.out.println("-------------------------------------------");
        System.out.println("Total yang harus dibayar : Rp " +(totalAwal-promo1-promo2));

        in.close();
    }
}
