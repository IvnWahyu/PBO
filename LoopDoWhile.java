public class LoopDoWhile {
    public static void main(String[] args) {
        int i = 1; //deklarasi & inisialisasi
        do {
            System.out.println(i /* untuk penambahan angka didepan huruf */+ ". Halo apa kabar");
            i = i + 1; // i++
        }
        while (i <= 5);
        System.out.println("Terima Kasih");
    }
}
