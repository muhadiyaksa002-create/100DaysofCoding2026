public class Days028 {
    public static void main(String[] args) {

        int a = 5;
        // nilai awal a adalah 5

        int b = a++;
        // nilai b = 5 (diambil dari nilai a yang lama), kemudian a menjadi 6

        int c = ++a;
        // a ditambah 1 dulu menjadi 7, kemudian nilai c = 7 (diambil dari a yang baru)

        int d = --c;
        // c dikurang 1 dulu menjadi 6, kemudian nilai d = 6 (diambil dari c yang baru)

        int e = d++;
        // nilai e = 6 (diambil dari nilai d yang lama), kemudian d menjadi 7

        System.out.println(a); // 7
        System.out.println(b); // 5
        System.out.println(c); // 6
        System.out.println(d); // 7
        System.out.println(e); // 6
    }
}
