import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        System.out.print("Masukkan angka dari 1-10: ");
        angka = sc.nextInt();
        do {
            if (angka > 10) {
                System.out.println("Angka yang anda masukkan salah");
                System.out.print("Mohon masukkan kembali: ");
                angka = sc.nextInt();
            } else {
                System.out.println("Angka yang anda masukkan benar");
                System.out.println("Angka yang anda masukkan = " + angka);
                break;
            }
        }while(true);

    }
}
