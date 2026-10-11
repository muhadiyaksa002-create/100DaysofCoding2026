import java.util.Scanner;

public class soalev3_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Batas Bawah :");
        int a = in.nextInt();
        System.out.print("Masukkan Batas Atas : ");
        int b = in.nextInt();
        System.out.print("Masukkan Angka Target : ");
        int c = in.nextInt();

        if (a>c || b<c ){
            System.out.println("Di diluar range!");
        }else{
            System.out.println("Di dalam range!");
        }

in.close();
    }
}
