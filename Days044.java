import java.util.Scanner;

public class Days044 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian :");
        int N = in.nextInt();

        if (N <0 || N >100) {
            System.out.println("Nilai Tidak Valid ");
        }else if (N >=90) {
            System.out.println("Predikat Nilai: A ");
        }else if (N >=80) {
            System.out.println("Predikat Nilai: B ");
        }else if (N >=70) {
            System.out.println("Predikat Nilai: C ");
        }else if (N >=60) {
            System.out.println("Predikat Nilai: D ");
        }else {
            System.out.println("Predikat Nilai: E ");
        }
    in.close();
    }
}
