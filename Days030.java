import java.util.Scanner;
public class Days030 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

     // input nilai pertama dan kedua
        System.out.print("Masukkan nilai Pertaman :");
        int one = in.nextInt();
        
        System.out.print("Masukkan nilai ke dua :");
        int two = in.nextInt();
        
        /*perbandingan lebih besar dari atau sama dengan ">=" dan 
        lebih kecil dari atau sama dengan "<=" dengan output true dan false */
        System.out.println("Nilai pertama lebih kecil dari nilai kedua :" + (one<=two));
        System.out.println("Nilai pertama lebih besar dari nilai kedua :" + (one>=two));

        in.close(); 
    }
}
