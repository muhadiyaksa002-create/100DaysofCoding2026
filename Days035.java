import java.util.Scanner;

public class Days035 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Apakah sudah terdaftar? : ");
        boolean T = in.nextBoolean();
        
        //nested if  
        if (T) {
        System.out.print("Masukkan nilai DDP : ");
        double DDP = in.nextDouble();
        System.out.print("Masukkan nilai PBO : ");
        double PBO = in.nextDouble();
        System.out.print("Masukkan nilai FWB : ");
        double FWB = in.nextDouble();
        
        //hitung rata" nilai terlebih dahulu
        double R = (DDP + PBO + FWB) / 3.0;
            System.out.println("Rata-rata nilai : " + R);

            if (R >= 75) {
                System.out.println("Status : Boleh Mengikuti Lomba");
            } else {
                System.out.println("Status : Nilai Belum Memenuhi Syarat");
            }
       } else {
            System.out.println("Status : Belum Terdaftar");
        }

        in.close();
    }
}
