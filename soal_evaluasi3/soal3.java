import java.util.Scanner;

public class soalev3_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("=== MESIN KOPI OTOMATIS ===");
        System.out.println("1. Kopi Hitam (Rp 5000)");
        System.out.println("2. Cappuccino (Rp 10000)");
        System.out.println("3. Teh Manis (Rp 4000)");
        System.out.println("===================");

        System.out.print("Pilih nomor minuman (1/2/3): ");
        int n = in.nextInt();

        if (n == 1){
            System.out.println("Anda memilih Kopi hitam. Silakan masukkan uang sebesar Rp 5000.");
        }else if (n == 2){
            System.out.println("anda memilih Cappucino. silahkan masukkan uang sebesar  Rp 10000.");
        }else if (n == 3){
            System.out.println("anda memilih Teh manis. silahkan masukkan uang sebesar Rp 4000.");
        }else{
            System.out.println("pilihan tidak valid! Minuman tidak ditemukan.");
        }

        in.close();

    }
}
