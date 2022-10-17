import java.util.Scanner;
public class UTSNomor4 {
    private int jari;
    private double phi = 3.14;

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
        return phi * jari * jari;
    }
    public double kelilingLingkaran(){

        return 2 * phi * jari;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UTSNomor4 lingkaran = new UTSNomor4();
        System.out.println("----------------------------------");
        System.out.println("Menghitung Luas dan Keliling Lingkaran");
        System.out.print("Masukan Jari-jari lingkaran : "); //input alas
        lingkaran.setJari(input.nextInt());

        System.out.println("Hasil akhirnya");
        System.out.println("Luas lingkaran: " + lingkaran.luasLingkaran());
        System.out.println("Keliling Lingkaran : " + lingkaran.kelilingLingkaran());
        System.out.println("----------------------------------");
    }
}
