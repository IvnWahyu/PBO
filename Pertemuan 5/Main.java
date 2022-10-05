package TugasPertemuan5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Segitiga segitiga = new Segitiga();
        System.out.println("----------------------------------");
        System.out.println("Menghitung Luas Segitiga");
        System.out.print("Masukan alas segitiga : ");
        segitiga.setAlas(input.nextInt());

        System.out.print("Masukan tinggi segitiga: ");
        segitiga.setTinggi(input.nextInt());

        Lingkaran lingkaran = new Lingkaran();
        System.out.println("----------------------------------");
        System.out.println("Menghitung Luas Lingkaran");
        System.out.print("Masukan jari-jari lingkaran : ");
        lingkaran.setJari(input.nextInt());

        System.out.println("----------------------------------");
        System.out.println("Hasil akhirnya");
        System.out.println("Luas segitiga: " + segitiga.hitungSegitiga());
        System.out.printf("Luas lingkaran: %.2f", lingkaran.hitungLingkaran());
        System.out.println("\n----------------------------------");
        input.close();
    }

}
