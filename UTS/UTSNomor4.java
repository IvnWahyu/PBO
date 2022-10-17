import java.util.Scanner;
public class UTSNomor4 {
    //Membuat attribut untuk jari jari dan phi
    private int jari;
    private double phi = 3.14;
    //Membuat getter dan setter

    public void setPhi(double phi) {
        this.phi = phi;
    }

    public int getJari() {
        return jari;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }

    public double luasLingkaran() {
        //Untuk menghitung luas dengan phi dikali dengan 2 jari jari
        return phi * jari * jari;
    }
    public double kelilingLingkaran(){
        //Untuk manghitung keliling dengan 2 dikali phi dan dikali jari
        return 2 * phi * jari;
    }

    public static void main(String[] args) {
        //Membuat method
        Scanner input = new Scanner(System.in);
        UTSNomor4 lingkaran = new UTSNomor4();
        System.out.println("----------------------------------");
        System.out.println("Menghitung Luas dan Keliling Lingkaran");
        System.out.print("Masukan Jari-jari lingkaran : "); //input jari jari
        lingkaran.setJari(input.nextInt());

        System.out.println("Hasil akhirnya");
        System.out.println("Luas lingkaran: " + lingkaran.luasLingkaran());//Output luas
        System.out.println("Keliling Lingkaran : " + lingkaran.kelilingLingkaran());//output Keliling
        System.out.println("----------------------------------");
    }
}
