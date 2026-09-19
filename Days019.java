public class Days019 {
    public static void main(String[] args) {
       // konversi nilain dari tipe data terbesar ke terkecil
      double angka = 150.75;
      float A = (float) angka;  
      long B = (long) angka;  
      int C = (int) angka;  
      short D = (short) angka;  
      byte E = (byte) angka;  
    // perhatikan perubahan pada setiap nilai yang di konversi ke tipe data yang berbeda
      
     System.out.println("Angka double\t:" + angka);
     System.out.println("Angka float\t:" + A);
     System.out.println("Angka long\t:" + B);
     System.out.println("Angka int\t:" + C);
     System.out.println("Angka short\t:" + D);
     System.out.println("Angka byte\t:" + E);

    }
}
