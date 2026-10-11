import java.util.Scanner;

public class soalev3_2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        if (angka == 0) {
            System.out.println("Ini adalah angka Nol.");
        } else if (angka > 0) {
            System.out.println("Ini adalah angka Positif.");

            if (angka % 2 == 0) {
                System.out.println("Angka ini bernilai Genap.");
            } else {
                System.out.println("Angka ini bernilai Ganjil.");
            }
        } else {
            System.out.println("Ini adalah angka Negatif.");
        }

        input.close();
    }
}
