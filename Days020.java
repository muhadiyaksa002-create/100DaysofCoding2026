public class Days020 {
    public static void main(String[] args) {
        int Angka = 100;
        double Nilai = 75.5;
        char Huruf = 'A';
        boolean Status = true;
        
        String angka_string = String.valueOf(Angka);
        String nilai_string= String.valueOf(Nilai);
        String huruf_string= String.valueOf(Huruf);
        String status_stirng = String.valueOf(Status);

        System.out.println("int ke string :" + angka_string);
        System.out.println("double ke string :" + nilai_string);
        System.out.println("char ke string :" + huruf_string);
        System.out.println("boolean ke string :" + status_stirng);
        
    }
}
