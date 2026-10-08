import java.util.Scanner;
public class Days037 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan kode energi :");
        int E = in.nextInt();
    
    if (E >0){
        System.out.println("Kode Diterima (Energi Positif)");
        if (E %2==0){
            System.out.println("Berhasil! Pintu Brankas Utama Terbuka, dokumen rahasia diamankan!");
        }else 
            System.out.println("JEBAKAN! Pintu terbuka tapi menyemprotkan Gas Beracun!");
    } else if (E <0){
        System.out.println("HACKER TERDETEKSI (Energi Negatif)");
        if (E %2==0)
            System.out.println("Peringatan! Alarm Level 1 Berbunyi!");
        else
            System.out.println("Peringatan Kritis! Pintu ruangan terkunci, Robot Penjaga dikerahkan!" );
    }else{
        System.out.println("Sistem brankas dimatikan. Harap mulai ulang. ");
    }
        
    in.close();

    }
}
