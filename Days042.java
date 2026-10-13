import java.util.Scanner;

public class Days042 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok: ");
        double Gp = in.nextDouble();
        System.out.print("Masukkan potongan bulanan: ");
        double Pb = in.nextDouble();

        if (Gp >=5000000 && Gp <= 10000000 && Pb >=500000 && Pb<= 1000000){
            System.out.println("Gaji Bersih Standar");
        }else if (Gp <=5000000 || Pb >= 1000000){
            System.out.println("Gaji Bersih Terlalu Rendah atau Potongan Terlalu Besar");
        }else if (Gp >=10000000 || Pb <=500000){
            System.out.println("Gaji Bersih Tinggi atau Potongan Sangat Kecil");
        }

        in.close();

    }
}
