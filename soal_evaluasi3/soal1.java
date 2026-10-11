import java.util.Scanner;
public class soalev3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan umur anda : ");
        int U = in.nextInt();

        System.out.print("Apakah membawa KTP Asli? (true/false): ");
        boolean KTP = in.nextBoolean();

        if (U>=17 && KTP){
            System.out.println("Pendaftaran Diterima! Silakan lanjut ke foto. ");
        }else {
            System.out.println("Pendaftaran Ditolak! Usia belum mencukupi atau KTP tidak ada.");
        }
        in.close();
    }
}
