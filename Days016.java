import java.util.Scanner;
public class Days016 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    System.out.print("Masukkan Jumlah Permen\t:");
    int JP = in.nextInt();
    
    System.out.print("Masukkan Jumlah Siswa\t:");
    int JS = in.nextInt();

    int Permen_per_siswa = JP / JS;
    int Sisa_Permen = JP % JS;
   

    System.out.println("=====DATA INPUT=====");
    System.out.println("Jumlah Permen\t:" +JP);
    System.out.println("Jumlah Siswa\t:" +JS);

    System.out.println("=====HASIL OUTPUT=====");
    System.out.println("Setiap Siswa Mendapatkan :" + Permen_per_siswa +" Permen");
    System.out.println("Permen Yang Tersisa :" + Sisa_Permen +" Permen");
  
    in.close();

    }
}
