import java.util.Scanner;

public class Days039 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double A1 = in.nextDouble();
        System.out.print("Masukkan angka ke dua: ");
        double A2 = in.nextDouble();
        System.out.print("Masukkan simbol operasi (+, -, *, /, %): ");
        char simbol = in.next().charAt(0);

        if (simbol == '+') {
            System.out.println("Hasil dari " + A1 + " " + simbol + " " + A2 + " adalah " + (A1 + A2));
        } else if (simbol == '-') {
            System.out.println("Hasil dari " + A1 + " " + simbol + " " + A2 + " adalah " + (A1 - A2));
        } else if (simbol == '*') {
            System.out.println("Hasil dari " + A1 + " " + simbol + " " + A2 + " adalah " + (A1 * A2));
        } else if (simbol == '/') {
            if (A2 == 0) {
                System.out.println("Error, tidak terdefinisi");
            } else {
                System.out.println("Hasil dari " + A1 + " " + simbol + " " + A2 + " adalah " + (A1 / A2));
            }
        } else if (simbol == '%') {
            if (A2 == 0) {
                System.out.println("Error, tidak terdefinisi");
            } else {
                System.out.println("Hasil dari " + A1 + " " + simbol + " " + A2 + " adalah " + (A1 % A2));
            }
        } else {
            System.out.println("Waduhhh, Operasi yang anda masukkan tidak ada!!! ");
        }

        in.close();
    }
}
