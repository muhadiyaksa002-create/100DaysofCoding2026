import java.util.*;
public class Latihan2 {
    public static void main(String[] args) {
    int[] angka = {10,20,15,25,30};
    int total= 0;
        for (int i = 0; i < angka.length; i++) {
        total += angka[i];
    }
    System.out.println("Data angka: ");
    System.out.println(Arrays.toString(angka));
    System.out.println("Total penjumlahan: "+total);
   
    }
}
