import java.util.Scanner;
public class Days014 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("masukkan tabungan awal\t:");
    int TA = in.nextInt(); 
    System.out.print("masukkan uang masuk\t:");
    int UM = in.nextInt();
    System.out.print("masukkan uang diambil\t:");
    int UD = in.nextInt();

    int jumlah = TA + UM - UD;

    System.out.println("=========================");
    System.out.println("     DATA TABUNGAN");
    System.out.println("=========================");
    System.out.println("tabungan awal\t:" + TA);
    System.out.println("uang masuk\t:" + UM);
    System.out.println("uang diambil\t:" + UD);
    System.out.println("jumlah tabungan\t:" + jumlah);

    System.out.println("==========================");

    in.close();
    }
}
