import java.util.Scanner;
public class Days017 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

         System.out.print("Masukkan poin awal pelanggan : ");
        int poin = in.nextInt();

        System.out.print("Masukkan poin transaksi baru : ");
        int PTB = in.nextInt();

        System.out.print("Masukkan poin yang ditukarkan : ");
        int PYD = in.nextInt();

        System.out.println();
        System.out.println("=====RIWAYAT PERUBAHAN POIN=====");
        System.out.println("Poin awal : " + poin);

        //Tambah poin dari transaksi menggunaka +=
        poin += PTB;
        System.out.println("Setelah tambah transaksi (+" + PTB + ") : " + poin);

        //Kurangi poin karena ditukarkan menggunakan -=
        poin -= PYD;
        System.out.println("Setelah tukar poin (-" + PYD + ") : " + poin);

        //Promo Double Points ini menghunakan *=2 yaitu poin dikalikan dengan dua dan angka dua bisa di ganti dengan angka apapun
        poin *= 2;
        System.out.println("Setelah promo Double Point (*=2): " + poin);

        System.out.println("Poin Akhir Pelanggan : " + poin);

        in.close();
    }
}
