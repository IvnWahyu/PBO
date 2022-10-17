import java.util.Scanner;
public class UTSNomor3 {
    //Membuat attribut total hasil dan angka
    private int total = 0;
    private int angka;
    public void input(){
        //Membuat method void untuk loop 10 bilangan
        Scanner input = new Scanner(System.in);
        for (int i=1; i<=10; i++){
            //Menggunakan fot untuk looping
            System.out.println("--------------------------------");
            System.out.println("Masukkan Nilai yang Ingin dijumlah");//Input angka
            System.out.print("Nilai : ");
            angka = input.nextInt();
            total += angka;
            System.out.println("hasil Total " + total);//Untuk output hasil total setiap penambahan angka
            System.out.println("--------------------------------");
        }
    }
    public static void main(String[] args) {
        //Membuat method main untuk memunculkan method sebelumnya
        UTSNomor3 turu = new UTSNomor3();
        System.out.println("Program Menghitung Angka");
        turu.input();
    }
}
