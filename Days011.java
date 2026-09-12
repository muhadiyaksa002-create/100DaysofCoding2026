import java.util.Scanner; //Untuk mengimpor class Scanner agar program dapat menerima input dari keyboard
public class Days011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Dengan membuat objek Scanner untuk membaca input dari keyboard

        System.out.println("======Input Biodata Mahasiswa=====");

        //  Untuk Meminta pengguna agar memasukkan Nama lewat keyboard
        System.out.print("Masukkan Nama: ");
       // untuk menerima text kita gunakan "input.nextLine();"
        String Nama = input.nextLine();

          //  Untuk Meminta pengguna agar memasukkan Nim lewat keyboard
        System.out.print("Masukkan Nim: ");
        // untuk menerima text kita gunakan "input.nextLine();"
        String Nim = input.nextLine();

          //  Untuk Meminta pengguna agar memasukkan Umur lewat keyboard
        System.out.print("Masukkan Umur: ");
        // Untuk menerima Bilangan bulat kita "gunakan input.nextInt();"
        int Umur = input.nextInt();

          //  Untuk Meminta pengguna agar memasukkan Tinggi Badan lewat keyboard
        System.out.print("masukkan Tinggi Badan: ");
        // Untuk menerima bilangan pecahan kita gunakan "input.nextDouble();"
        double Tinggi = input.nextDouble();

          //  Untuk Meminta pengguna agar memasukkan Grade lewat keyboard
        System.out.print("Masukkan Grade: ");
        // Untuk menerima satu karakter kita Gunakan "input.next().charAt(0);"
        char Grade = input.next().charAt(0);

        System.out.println("\n=====Biodata Mahasiwa=====");

        // menampilkan data dengan Printf()
        System.out.printf("%-15s : %s%n","Nama", Nama);
        System.out.printf("%-15s : %s%n","Nim", Nim);
        System.out.printf("%-15s : %d Tahun%n", "Umur", Umur);
        System.out.printf("%-15s : %.2f cm%n", "Tinggi badan", Tinggi);
        System.out.printf("%-15s : %c%n", "Grade", Grade);

        System.out.println("==========================");

    }
}
