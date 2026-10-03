import java.util.Scanner;

public class Days032 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int batasPendapatan = 4000000;

        System.out.print("Nilai :");
        int N = in.nextInt();
        
        System.out.print("Pendapatan Ortu :");
        int PO = in.nextInt();

        System.out.print("Organisasi :");
        Boolean O = in.nextBoolean();
        
        System.out.print("Pernah Beasiswa :");
        Boolean PB = in.nextBoolean();

        boolean syaratNilai = N >=80;

        boolean syaratOrganisasi = PO <= batasPendapatan || O;

        boolean Lulus = syaratNilai && syaratOrganisasi && !PB;
        
        System.out.println();
        System.out.println("Syarat Nilai terpenuhi :" +syaratNilai);
        System.out.println("Syarat Pendapatan/Organisasi :" + syaratOrganisasi);
        System.out.println("Lolos Seluruh Seleksi :" + Lulus);

        in.close();
    }
}
