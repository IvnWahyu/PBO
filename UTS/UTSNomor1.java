import java.util.Scanner;
public class UTSNomor1 {
    private int jamMulai;
    private int jamAkhir;
    private int menitMulai;
    private int menitAkhir;
    private int detikMulai;
    private int detikAkhir;

    public void mulai(){
        Scanner awal = new Scanner(System.in);
        System.out.print("Jam : ");
        jamMulai = awal.nextInt();
        System.out.print("Menit : ");
        menitMulai = awal.nextInt();
        System.out.print("Detik : ");
        detikMulai = awal.nextInt();
    }

    public void akhir(){
        Scanner akhir = new Scanner(System.in);
        System.out.print("Jam : ");
        jamAkhir = akhir.nextInt();
        System.out.print("Menit : ");
        menitAkhir = akhir.nextInt();
        System.out.print("Detik : ");
        detikAkhir = akhir.nextInt();
    }

    public void hitung(){
        int hitungWaktu = (jamAkhir - jamMulai) * 3600 +
                (menitAkhir - menitMulai) * 60 +
                (detikAkhir + detikMulai);
        int hasilAkhir = hitungWaktu * 30;
        System.out.println("Biaya : " + hasilAkhir);
    }

    public static void main(String[] args) {
        UTSNomor1 akhir = new UTSNomor1();
        System.out.println("Selamat Datang di Ivan Wartel ");
        System.out.println("Silahkan Masukkan Waktu");
        System.out.println("---------------------------------------------------");
        akhir.mulai();
        System.out.println("---------------------------------------------------");
        akhir.akhir();
        System.out.println("---------------------------------------------------");
        akhir.hitung();
        System.out.println("---------------------------------------------------");
        System.out.println("TerimaKasih Telah Menggunakan Ivan Wartel");
    }

}
