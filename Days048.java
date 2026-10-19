import java.util.Scanner;

public class Days048 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double A1 = in.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double A2 = in.nextDouble();

        System.out.print("Masukkan simbol operasi (+, -, *, /, %): ");
        char operasi = in.next().charAt(0);

        double hasil = 0;
        boolean valid = true;

        switch (operasi) {
            case '+':
                hasil = A1 + A2;
                break;
            case '-':
                hasil = A1 - A2;
                break;
            case '*':
                hasil = A1 * A2;
                break;
            case '/':
                if (A2 != 0) {
                    hasil = A1 / A2;
                } else {
                    System.out.println("Error, pembagian dengan nol tidak diperbolehkan");
                    valid = false;
                }
                break;
            case '%':
                if (A2 != 0) {
                    hasil = A1 % A2;
                } else {
                    System.out.println("Error, modulus dengan nol tidak diperbolehkan");
                    valid = false;
                }
                break;
            default:
                System.out.println("Operasi tidak tersedia");
                valid = false;
                break;
        }
        if (valid) {
            System.out.println("Hasil: " + hasil);
        }

        in.close();
    }
}
