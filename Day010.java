public class Days010 {
    public static void main(String[] args) {
        System.out.println("=== BATAS MINIMAL DAN MAKSIMAL TIPE DATA ===");
        /* konstanta MIN_VALUE digunakan untuk  melihat  batas minimal pada jenis data
         sedangkan MAX_VALUE digunakan untuk melihat data Maksimalpada jenis data */

        // menampilakn batas max dan min pada tipe data Byte
        System.out.println("\nBYTE");
        System.out.println("Minimal  : " + Byte.MIN_VALUE);
        System.out.println("Maksimal : " + Byte.MAX_VALUE);

        // menampilakn batas max dan min pada tipe data short   
        System.out.println("\nSHORT");
        System.out.println("Minimal  : " + Short.MIN_VALUE);
        System.out.println("Maksimal : " + Short.MAX_VALUE);

        // menampilakn batas max dan min pada tipe data int
        System.out.println("\nINT");
        System.out.println("Minimal  : " + Integer.MIN_VALUE);
        System.out.println("Maksimal : " + Integer.MAX_VALUE);

        // menampilakn batas max dan min pada tipe data long
        System.out.println("\nLONG");
        System.out.println("Minimal  : " + Long.MIN_VALUE);
        System.out.println("Maksimal : " + Long.MAX_VALUE);

        // menampilakn batas max dan min pada tipe data float
        System.out.println("\nFLOAT");
        System.out.println("Minimal  : " + Float.MIN_VALUE);
        System.out.println("Maksimal : " + Float.MAX_VALUE);

        // menampilakn batas max dan min pada tipe data double
        System.out.println("\nDOUBLE");
        System.out.println("Minimal  : " + Double.MIN_VALUE);
        System.out.println("Maksimal : " + Double.MAX_VALUE);

        // menampilakn batas max dan min pada tipe data char
        System.out.println("\nCHAR");
        System.out.println("Minimal  : " + (int) Character.MIN_VALUE);
        System.out.println("Maksimal : " + (int) Character.MAX_VALUE);
    }
}
