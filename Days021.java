import java.util.Scanner;
public class Days021 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // final untuk nilai tetap yang dipakai untuk menambah dan mengurang saldo
        final double TAMBAH = 50000;
        final double KURANG = 25000;
        final double KALI = 2;
        final double BAGI = 5;

        // biodata di input dalam bentuk string
        System.out.print("Nama :");
        String nama = in.nextLine();
        
        System.out.print("Umur :");
        String strumur = in.nextLine();
        
        System.out.print("TB :");
        String strTB = in.nextLine();
        
        System.out.print("Insial :");
        String strInisial = in.nextLine();
        
        System.out.print("Status Mahasiswa :");
        String strSM = in.nextLine();
        
        System.out.print("Saldo Awal :");
        String strSA = in.nextLine();

        // konversi String ke Tipe data Primitif
        int umur = Integer.parseInt(strumur);
        double TB = Double.parseDouble(strTB);
        char Insial = strInisial.charAt(0);
        boolean SM = Boolean.parseBoolean(strSM);
        double SA = Double.parseDouble(strSA);

        // println + escape sequence \n
        System.out.println("\n=== Biodata Mahasiswa ==="); 
        System.out.printf("Nama : %s, Umur : %d, Tinggi : %.1f, insial : %c, Status : %b, saldo : %.0f%n",
            nama, umur, TB, Insial, SM, SA);
    
        umur += 1; 
        String genapGanjil = (umur % 2 == 0) ? "genap" : "ganjil"; // operator %
        double umurDouble = umur;      // konversi otomatis int ke double
        int tinggiInt = (int) TB;      // konversi manual/casting double ke int

        String strUmurBaru = String.valueOf(umur);
        String strSaldoBaru = String.valueOf(SA);

        System.out.printf("%nUmur akhir: %d (%s), double: %.1f%n", umur, genapGanjil, umurDouble);
        System.out.printf("Tinggi (int): %d, Saldo akhir: %.0f%n", tinggiInt, SA);
        System.out.println("String hasil: umur=" + strUmurBaru + ", saldo=" + strSaldoBaru);

        System.out.println("Output");
        // saldo Awal di tampilkan      
        System.out.printf("%nSaldo akhir : %.0f%n", SA);
        
        // saldo di tambah,kurang,kali dan tambah       
        SA += TAMBAH;      
        System.out.printf("Setelah ditambah : %.0f%n", SA);

        SA -= KURANG;      
        System.out.printf("Setelah dikurangi : %.0f%n", SA);

        SA *= KALI;           
        System.out.printf("Setelah dikali 2 : %.0f%n", SA);

        SA /= BAGI;          
        System.out.printf("Setelah dibagi 5 : %.0f%n", SA);

        in.close();
    }
}
