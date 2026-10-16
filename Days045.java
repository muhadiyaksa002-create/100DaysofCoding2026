import java.util.Scanner;

public class Days045 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Pilih menu :");
        int M = in.nextInt();

        switch (M) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Ahad");
                break;
            default :
                System.out.println("Nomor Hari Tidak Valid ");
        }
      in.close();
    }
}
