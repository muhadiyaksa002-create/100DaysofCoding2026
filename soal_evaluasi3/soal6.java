import java.util.Scanner;

public class soalev3_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan HP :");
        int a = in.nextInt();
        System.out.print("Masukkan Damage :");
        int b = in.nextInt();
        System.out.print("Menang? (true/false) :");
        boolean c = in.nextBoolean();

        int level = 1;
        if (c == true){
            level++;
        }else {
            a -= b;
            level--;
        }
        System.out.println("Sisa HP :" + a);
        System.out.println("Level :" + level);\

    in.close();
    
    }
}
