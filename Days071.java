import java.util.Scanner;

public class Days071 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

	    int pemasukan = 0;
      int total = 0;

        while (pemasukan >= 0) {
            System.out.print("Masukkan pemasukan (angka negatif untuk berhenti): ");
            pemasukan = in.nextInt();

            if (pemasukan >= 0) {
                total += pemasukan;
            }
        }

        System.out.println("Total seluruh pemasukan: Rp " + total);

        in.close();
    }
}
