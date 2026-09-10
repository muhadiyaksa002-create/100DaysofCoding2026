public class Days09 {
    public static void main(String[] args) {

        /*Konstanta dalam Java adalah nilai yang tetap dan tidak dapat diubah setelah diberikan nilai.
        Konstanta di buat dengan "final" 
        kita juga menggunakan double untuk membaca angka desimal*/
        final double Harga = 15000;
        final double Diskon = 0.10;

        /*untuk potongan menghitung berapa besar uang yang dipotong dari harga awal.
        dengan rumus "harga X Diskon"
        untuk  HargaAkhir menghitung harga yang harus dibayar setelah mendapatkan diskon.
        dengan Rumus "harga awal /potongan"
         */
        double potongan = Harga * Diskon;
        double HargaAkhir = Harga - potongan;

        System.out.println("Harga Awal\t: Rp" + Harga);
        System.out.println("Diskon\t\t: " + (Diskon * 100) + "%");
        System.out.println("Potongan\t: Rp" + potongan);
        System.out.println("Harga Akhir\t: Rp" + HargaAkhir);
    }
}
