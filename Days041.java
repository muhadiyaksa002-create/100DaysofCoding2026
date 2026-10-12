import java.util.Scanner;
public class Days041 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan suhu ruangan: ");
        double S = in.nextDouble();
        
        System.out.print("Masukkan kelembapan ruangan: ");
        double K = in.nextDouble();

        if (S >=18 && S<= 28 && K >=40 && K <=60){
            System.out.println("Ruangan Nyaman");
        }else if (S <=18 || K <= 40){
            System.out.println("Suhu atau Kelembapan Terlalu Rendah");
        }else if (S >= 28 || K >60){
            System.out.println("Suhu atau Kelembapan Terlalu Tinggi ");
        }
        in.close();
    }
}
