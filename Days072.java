import java.util.Scanner;

public class Days072 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int menu;
        
        do {
            System.out.println("===KANTIN KAMPUS===");
            System.out.println("1. Nasi goreng (15000)");
            System.out.println("2. Mie goreng (12000)");
            System.out.println("3. Ayam geprek (18000)");
            System.out.println("4. keluar");

            System.out.print("Pilih menu :");
            menu = in.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Anda memilih Nasi Goreng ");
                    System.out.println("Harga: Rp15000 ");
                    break;
                case 2:
                    System.out.println("Anda memilih mie Goreng ");
                    System.out.println("Harga: Rp12000 ");
                    break;
                case 3:
                    System.out.println("Anda memilih Ayam geprek ");
                    System.out.println("Harga: Rp18000 ");
                    break;
                default:
                    System.out.println("Terima kasih telah menggunakan layanan kantin! ");
                    break;
            }            
        } while (menu !=4);
    in.close();
    }
}
