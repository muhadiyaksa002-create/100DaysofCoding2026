import java.util.Scanner;
public class Days018 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("masukkan angka pertama :");
        byte angka = in.nextByte();

        short A = angka;
        int B = angka;
        long C = angka;
        float D =  angka;
        double E = angka;
        System.out.println();

        System.out.println("konversi nilai pertama");
        System.out.println("nilai angka byte:" + angka);
        System.out.println("nilai angka short:" + A);
        System.out.println("nilai angka int:" + B);
        System.out.println("nilai angka long:" + C);
        System.out.println("nilai angka float:" + D);
        System.out.println("nilai angka double:" + E);
        
    in.close();
    }
}
