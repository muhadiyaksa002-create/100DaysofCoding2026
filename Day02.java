public class Days02 {
    public static void main(String[] args) {

        //println() digunakan untuk mencetak data agar otomatis berpindah baris
        System.out.println("BIODATA DIRI SAYA");
        System.out.println("Nama: Muh.Adiyaksa");

        //print() digunakan untuk mencetak data namun tida berpindah baris otomatis
        System.out.print("NIM: ");
        System.out.print("H0725509");
        System.out.println();

        //printf() digunakan untuk mencetak data dengan format khusus
        String prodi = "Pendidikan Teknologi Informasi";
        int umur = 19;

        System.out.printf("Program Studi: %s%n", prodi);
        System.out.printf("Umur: %d tahun%n", umur);
    }
}
