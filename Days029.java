import java.util.Scanner;
public class Days029 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // input nilai pertama dan kedua
        System.out.print("Masukkan NIlai Pertaman :");
        int one = in.nextInt();
        
        System.out.print("Masukkan NIlai ke dua :");
        int two = in.nextInt();
        
        //membandingkan nilai pertama dan ke dua denga operator lebih besar ">" dan lebih kecil "<" dengan output true dan false
        System.out.println("Nilai pertama lebih kecil dari nilai kedua :" + (one<two));
        System.out.println("Nilai pertama lebih besar dari nilai kedua :" + (one>two));

        in.close();
    }
}
