import java.util.Scanner;
public class Days026 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            // SOAL 1
        System.out.print("Masukkan Nama\t :");
        String A = in.nextLine();

        System.out.print("Masukkan Nim\t :");
        String B = in.nextLine();

        System.out.print("Masukkan Kelas\t :");
        char C = in.next().charAt(0);

        System.out.print("Masukkan Umur\t :");
        int D = in.nextInt();
        in.nextLine();
        System.out.print("Masukkan Prodi\t :");
        String E = in.nextLine();

        System.out.print("Masukkan IPK\t :");
        char F = in.next().charAt(0);

        System.out.print("Status Keaktifan :");
        boolean G = in.nextBoolean();

        System.out.println("===BIODATA MAHASISWA===");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
        System.out.println(G);
        System.out.println("=======================");

        // SOAL 2
        final double PHI = 3.14;
        int a = in.nextInt();
        System.out.println(PHI*a*a);

        // SOAL 3
        int f= in.nextInt();
        int b= in.nextInt();
        f=f+b;
        b=f-b;
        f=f-b;

        System.out.println(f);
        System.out.println(b);
    }
}
