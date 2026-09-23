import java.util.Scanner;
public class Days022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // input nilai terlebih dahulu
        System.out.print("masukkan nilai a :" );
        int a = in.nextInt();
        
        System.out.print("masukkan nilai b :" );
        int b = in.nextInt();

        // kita tampilkan nilai sebelum di tukar
        System.out.println("\nSebelum ditukar : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // menukar nilai dengan variebel tambahan yaitu NA =Nilai Awal
        int NA = a; 
        a = b;
        b = NA;
        // kita print kembali dengan nilai yang di tukar menggunakan variabel tanbahan
        System.out.println("\nDengan variabel tambahan : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //mengubah kembali posisi nilai awal sesuai yang di input
        NA = a;
        a = b;
        b = NA;
        
        // menukar nilai tanpa variabel tambahan
        a = a + b;   
        b = a - b;   
        a = a - b;
        //print kembali untuk menampilkan
        System.out.println("\nTanpa variabel tambahan : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    
        in.close();
        
    }
}
