import java.security.Key;
import java.util.Scanner;
public class Days034 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian :");
        int N = in.nextInt();

        System.out.print("Apakah sudah terdaftar? :");
        boolean T = in.nextBoolean();

        // menentukan 4 kategori nilai yang ada
        String K;
        if (N >= 80) {
            K = "Sangat Baik";
        } else if (N >= 70) {
            K = "Baik";
        } else if (N>= 60) {
            K = "Cukup";
        } else {
            K = "Kurang";
        }
        // penentuan apakah lulus atau tidak dengan operator AND &&
        String S;
        if (N >=60 && T){
            S = "Lulus";
        }
        else {
            S = "tidak Lulus";
        }

        System.out.println("Kategori nilai :" + K);
        System.out.println("Status :" + S);

        in.close();
    }
}
