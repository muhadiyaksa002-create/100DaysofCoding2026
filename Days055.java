import java.util.Scanner;

public class Days055 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan batas angka :");
        int angka = in.nextInt();
        
        if (angka<1){
            System.out.println("Batas tidak valid!");
            return;
        }
        for (int i = 1; i <=angka; i++) {
            if (i %3 == 0){
                continue;
            }
            if(i == 13){
                break;
            }
            System.out.print(i + "");
        }
            if (angka >=13){
                System.out.println("\nSistem dihentikan di angka 13");
            }else{
                System.out.println("\nPencetakan Selesai.");
            }
        in.close();
    }
}
