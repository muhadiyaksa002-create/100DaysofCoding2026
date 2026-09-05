public class Day4 {
public static void main(String[] args) {

// tipe data numerik bilangan bulat byte 8 bit dengan rentan sekitar -128 sampai 127 
    byte tinggiBadan = 123;  
    System.out.printf( "tinggi badan\t:%d cm%n", tinggiBadan);  

    // tipe data numerik bilangan bulat short 16 bit  dengan  rentan -32.768 sampai 32.767
    short lebarTanah = 3598;  
    System.out.printf("Lebar Tanah\t:%,d m%n", lebarTanah);  

    // tipe data numerik bilangan bulat int 32 bit dengan rentan -2,1M sampai 2,1M
    int totalharga = 100000;  
    System.out.printf("Total harga\t:Rp%,d%n",totalharga);  

    // tipe data numerik bilangan bulat long 64 bit  rentan nilai yang lebih besar dari Int
    // nilai long yang melampaui batas nilai int harus menggunakan suffix (L) di akhir angka
    long Keuntungan = 720000000000000L;  
	System.out.printf("Keuntungan\t:Rp%,d%n",Keuntungan);  
	}

}
