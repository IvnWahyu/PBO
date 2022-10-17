import java.util.Scanner;
public class UTSNomor2 {
    //Membuat attribut untuk tinggi, badan dan berat badan
    private double tinggi;
    private double berat;
    private double beratBadan;


    public void inputBerat() {
        //Membuat method untuk input berat dan tinggii
        Scanner input = new Scanner(System.in);
        System.out.println("Perhitungan Berat Badan Berdasarkan BMI");
        System.out.print("Masukkan berat badan : ");//Input berat
        berat = input.nextDouble();
        System.out.print("Masukkan Tinggi Badan : ");//Input tinggi
        tinggi = input.nextDouble();
    }

    public void bmi(){
        //Membuat Method untuk menghitung bmi sekaligus total
        beratBadan = berat / (tinggi * tinggi);
        System.out.println("Hasil : " + beratBadan);//output hasil BMI
    }

    public void hitungBmi(){
        //Membuat method void untuk menentukan BMI nya ideal atau underweight atau overweight menggunakan if else
        if (beratBadan>=18.5&&beratBadan<=22.9){
            System.out.println("Ideal");
        }else if(beratBadan<18.5){
            System.out.println("Underweight");
        }else {
            System.out.println("overweight");
        }
    }

    public static void main(String[] args) {
        //Membuat method main untuk menuculkan method sebelumnya
        UTSNomor2 badan = new UTSNomor2();
        System.out.println("--------------------------------");
        badan.inputBerat();//Input tinggi dan berat badan
        System.out.println("--------------------------------");
        badan.bmi();//Output hasil BMI
        badan.hitungBmi();//Output untuk menentukan BMI nya ideal atau underweight atau overweight
        System.out.println("--------------------------------");
        System.out.println("TerimaKasih Telah Menggunakan Perhitungan ini");
    }
}
