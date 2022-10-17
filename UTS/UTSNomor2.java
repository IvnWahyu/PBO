import java.util.Scanner;
public class UTSNomor2 {
    private double tinggi;
    private double berat;
    private double beratBadan;


    public void inputBerat() {
        Scanner input = new Scanner(System.in);
        System.out.println("Perhitungan Berat Badan Berdasarkan BMI");
        System.out.print("Masukkan berat badan : ");
        berat = input.nextDouble();
        System.out.print("Masukkan Tinggi Badan : ");
        tinggi = input.nextDouble();
    }

    public void bmi(){
        beratBadan = berat / (tinggi * tinggi);
        System.out.println("Hasil " + beratBadan);
    }

    public void hitungBmi(){
        if (beratBadan>=18.5&&beratBadan<=22.9){
            System.out.println("Ideal");
        }else if(beratBadan<18.5){
            System.out.println("Underweight");
        }else {
            System.out.println("overweight");
        }
    }

    public static void main(String[] args) {
        UTSNomor2 badan = new UTSNomor2();
        System.out.println("--------------------------------");
        badan.inputBerat();
        System.out.println("--------------------------------");
        badan.bmi();
        badan.hitungBmi();
        System.out.println("--------------------------------");
        System.out.println("TerimaKasih Telah Menggunakan Perhitungan ini");
    }
}
