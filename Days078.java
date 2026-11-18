import java.util.Scanner;

public class Days078 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== REGISTRASI AKUN ===");
        System.out.print("Buat username: ");
        String usernameAkun = in.nextLine();
        System.out.print("Buat password: ");
        String passwordAkun = in.nextLine();

        System.out.println("Akun berhasil dibuat!");
        System.out.println("=== LOGIN AKUN ===");

        boolean berhasilLogin = false;

        do {
            System.out.print("Masukkan username: ");
            String usernameLogin = in.nextLine();
            System.out.print("Masukkan password: ");
            String passwordLogin = in.nextLine();

            if (usernameLogin.equals(usernameAkun) && passwordLogin.equals(passwordAkun)) {
                System.out.println("Selamat, Login Berhasil!");
                berhasilLogin = true;
            } else {
                System.out.println("Username atau password salah.");
                System.out.println("Silakan login kembali.");
            }
        } while (!berhasilLogin);
        in.close();
    }
}
