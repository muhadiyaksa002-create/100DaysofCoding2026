import java.util.Scanner;
public class Days015 {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);

        System.out.print("Harga satuan\t:");
        int Hs = in.nextInt();
        
        System.out.print("Jumlah barang\t:");
        int Jb = in.nextInt();
        
        System.out.print("Jumlah orang\t:");
        int Jo = in.nextInt();

        int Total_Harga = Hs * Jb;
        int Harga_per_orang = Total_Harga / Jo; 
        System.out.println();

        System.out.println("Total harga\t:" + Total_Harga);
        System.out.println("Harga perorang\t:" + Harga_per_orang);

        in.close();
    }
}
