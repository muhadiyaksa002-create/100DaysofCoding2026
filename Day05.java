public class Days05 {
    public static void main(String[] args) {

        // kita menginput data dengan 3 data nilai menggunakan double yaitu tipe bilangan desimal
        double nilaiTugas = 85.5;
        double nilaiUTS = 80.0;
        double nilaiUAS = 90.5;

        // kita akan mencari nilai rata-rata dengan menjumlahkan ke 3 data nilai
        // kemudian kita bagi "/" 3 untuk melihat nilai Rata-ratanya
        double rataRata =(nilaiTugas + nilaiUTS + nilaiUAS) / 3;

        System.out.println("================================");
        System.out.println("NILAI MAHASISWA");
        System.out.println("================================");

        // kemudain kita menampilkan ke 3 nilai tugas, UTS, UAS
        System.out.println("Nilai Tugas\t:" + nilaiTugas);
        System.out.println("Nilai UTS\t:" + nilaiUTS);
        System.out.println("Nilai UAS\t:" + nilaiUAS);
        System.out.println();
        // kemudian kita menampilkan hasil Nilai rata-rata yang telah di hitung
        System.out.println("Nilai Rata-Rata\t= " + rataRata);
        System.out.println();

        System.out.println("==========TERIMA KASIH==========");
    }

}
