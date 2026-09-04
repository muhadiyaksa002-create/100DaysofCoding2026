public class Days03 {
    public static void main(String[] args) {

        // Escape sequence adalah karakter khusus dalam Java yang diawali dengan tanda backslash (\). Escape sequence digunakan untuk memberikan fungsi tertentu di dalam String, misalnya membuat baris baru, tab, atau menampilkan tanda kutip Dll.

        // \n: Digunakan untuk pindah ke baris baru, seperti menekan Enter
        System.out.println("Contoh Escape Sequence new line: (\\n)");
        System.out.print("Nama : Muh.Adiyaksa \nHobi : mancing");
        System.out.println();
        System.out.println();

        // \t: Digunakan untuk memberikan jarak/tab
        System.out.println("Contoh Escape Sequence Tab (\\t):");
        System.out.println("Nim\t: H0725509");
        System.out.println("Alamat\t: Lingk.Salabulo");
        System.out.println("Jurusan\t: Pendidikan Teknologi Informasi");
        System.out.println();

        // \": Digunakan untuk menampilkan tanda kutip ganda di dalam string
        System.out.println("Contoh Escape Sequence tanda kutip (\\\"):");
        System.out.print("Judul Bukunya : \"Sang Kancil\"");
        System.out.println();
        System.out.println();

        // \\: Digunakan untuk menampilkan karakter backslash
        System.out.println("Contoh Escape Sequence dua backslas (\\\\):");
        System.out.println("Alamat file :C:\\Users\\Muh.Adiayksa\\Dokumen Days03");

    }
    
}
