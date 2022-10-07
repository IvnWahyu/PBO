import java.util.Scanner;

public class NilaiMahasiswa {
    private double nilai;
    public NilaiMahasiswa(){
        this.nilai = 0;
    }
    public void setNilai(double nilai){
        this.nilai = nilai;
    }
    public double getNilai(){
        return this.nilai;
    }

    public double hitungNilai(){
        double hitung;
        hitung = this.nilai;
        if(nilai>=90&&nilai<=100){
            System.out.println("Nilai Huruf = A");
        }else if(nilai>=80&&nilai<=89.99){
            System.out.println("Nilai Huruf = A-");
        }else if(nilai>=75&&nilai<=79.99){
            System.out.println("Nilai Huruf = B+");
        }else if(nilai>=65&&nilai<=69.99){
            System.out.println("Nilai Huruf = B");
        }else if(nilai>=60&&nilai<=64.99){
            System.out.println("Nilai Huruf = C+");
        }else if(nilai>=55&&nilai<=59.99){
            System.out.println("Nilai Huruf = C");
        }else if(nilai>=50&&nilai<=54.99){
            System.out.println("Nilai Huruf = C-");
        }else if(nilai>=40&&nilai<=49.99){
            System.out.println("Nilai Huruf = D");
        }else if(nilai>=0&&nilai<=39.99){
            System.out.println("Nilai Huruf = E");
        }
        return hitung;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NilaiMahasiswa masuk = new NilaiMahasiswa();
        System.out.println("----------------------------------");
        System.out.print("Masukkan nilai : ");
        masuk.nilai = input.nextDouble();
        System.out.println("Hasil ");
        System.out.println("Nilai Angka = "+masuk.nilai);
        System.out.println("----------------------------------");
        masuk.hitungNilai();
        System.out.println("----------------------------------");
    }
}
