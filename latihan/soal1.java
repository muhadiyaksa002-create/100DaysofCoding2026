import java.util.Scanner;
public class Soal_latihan2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("masukkan total kembalian :");
        int TK = in.nextInt();

        int lembar50k = TK / 50000;
        TK = TK % 50000;
        
        int lembar10k = TK / 10000; 
        TK = TK % 10000;
        
        int lembar1k = TK / 1000; 
        TK = TK % 1000;

        System.out.println("Pecahan 50.000 :" + lembar50k + "Lembar");
        System.out.println("Pecahan 10.000 :" + lembar10k + "Lembar");
        System.out.println("Pecahan 1.000 : " + lembar1k + "Lembar");

       in.close(); 
    }
}
