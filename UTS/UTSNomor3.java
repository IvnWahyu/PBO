import java.util.Scanner;
public class UTSNomor3 {
    private int total = 0;
    private int angka;
    public void input(){
        Scanner input = new Scanner(System.in);
        for (int i=1; i<=10; i++){
            System.out.println("Masukkan Nilai yang Ingin dijumlah");
            System.out.print("Nilai : ");
            angka = input.nextInt();
            total += angka;
            System.out.println("hasil Total " + total);
        }
    }


    public static void main(String[] args) {
        UTSNomor3 turu = new UTSNomor3();
        System.out.println("Program Menghitung Angka");
        turu.input();
    }
}
