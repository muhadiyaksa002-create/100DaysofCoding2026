import java.util.Scanner;
public class evaluasi1_soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.print("Masukkan Username\t:");
    String Username = input.nextLine();

    System.out.print("Masukkan Umur\t:");
    byte Umur = input.nextByte();

    System.out.print("Masukkan Tinggi Badan\t:");
    double Tinggi  = input.nextDouble();

    System.out.print("Masukkan Gol. Darah\t:");
    char GolDarah = input.next().charAt(0);

    System.out.print("Masukkan akun Private?\t:");
    boolean AkunPrivat = input.nextBoolean();

    System.out.println("=====PROFILFACEGRAM=====");
    System.out.println( " user name\t:" + Username);
    System.out.println("umur\t:" + Umur);
    System.out.println("Tinggi Badan\t:" + Tinggi);
    System.out.println("Gol.Darah\t:" +GolDarah);
    System.out.println("Akun Pivate\t:" + AkunPrivat);

    System.out.println("=====================");
    input.close(); 
    }
  }

// soal ke 2 evaluasi hari ini
import java.util.Scanner;
public class evaluasi1_soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final String NAMA_KANTIN = "KANTIN KEJUJURAN TI";

        System.out.print("Masukkan Nama Makanan :");
        String makanan = input.nextLine();

        System.out.print("Masukkan Harga satuan :");
        int harga = input.nextInt();

        System.out.print( "Masukkan Jumlah Beli : ");
        byte porsi = input.nextByte();

        int Total = harga * porsi;

        System.out.print("Anda memesan "  + porsi + " porsi " + " total harga yang harus di bayar "+ Total );
        System.out.println();

        input.close();
    }
  
}

// soal 3 evaluasi hari ini
import java.util.Scanner;
public class evaluasi1_soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final String NAMA_KANTIN = "KANTIN KEJUJURAN TI";

        System.out.print("Masukkan Nama Makanan :");
        String makanan = input.nextLine();

        System.out.print("Masukkan Harga satuan :");
        int harga = input.nextInt();

        System.out.print( "Masukkan Jumlah Beli : ");
        byte porsi = input.nextByte();

        int Total = harga * porsi;

        System.out.print("Anda memesan "  + porsi + " porsi " + " total harga yang harus di bayar "+ Total );
        System.out.println();

        input.close();
    }
}
