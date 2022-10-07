import java.util.Scanner;
public class QuizNomor1 {
    //Membuat attribut alas dan tinggi
    private int alas;
    private int tinggi;
    //membuat setter alas dan tinggi
    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    //Membuat perhitungan luas segitiga
    public double hitungSegitiga() {
        return 0.5 * alas * tinggi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        QuizNomor1 segitiga = new QuizNomor1();
        System.out.println("----------------------------------");
        System.out.println("Menghitung Luas Segitiga");
        System.out.print("Masukan alas segitiga : "); //input alas
        segitiga.setAlas(input.nextInt());

        System.out.print("Masukan tinggi segitiga: ");//input tinggi
        segitiga.setTinggi(input.nextInt());

        System.out.println("Hasil akhirnya");
        System.out.println("Luas segitiga: " + segitiga.hitungSegitiga());//output
        System.out.println("----------------------------------");
    }
}
