import java.util.Scanner;
public class Days033 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Nilai Ujian :");
        int NU = in.nextInt();
        
        System.out.print("Apakah Sudah Terdaftar? :");
        boolean T  = in.nextBoolean();

        if (NU >=75 && T) {
            System.out.println("Status : Boleh Mengikuti Ujian");
        }
        else{
            System.out.println("Status : Belum Boleh Mengikuti Ujian");
        }
         
        in.close();
    }
}
