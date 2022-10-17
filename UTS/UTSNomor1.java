import java.util.Scanner;
public class UTSNomor1 {
    //Membuat attribut untuk jam, menit, detik dan juga hitungan
    private int jamMulai;
    private int jamAkhir;
    private int menitMulai;
    private int menitAkhir;
    private int detikMulai;
    private int detikAkhir;
    private int hitungWaktu;

    public void mulai(){
        //Membuat method void untuk input waktu mulai dan akhir
        Scanner awal = new Scanner(System.in);
        System.out.print("Jam : ");
        jamMulai = awal.nextInt();
        System.out.print("Menit : ");
        menitMulai = awal.nextInt();
        System.out.print("Detik : ");
        detikMulai = awal.nextInt();
        System.out.println("---------------------------------------------------");
        System.out.print("Jam : ");
        jamAkhir = awal.nextInt();
        System.out.print("Menit : ");
        menitAkhir = awal.nextInt();
        System.out.print("Detik : ");
        detikAkhir = awal.nextInt();
    }


    public void hitung(){
        //Membuat method untuk menghitung berapa detik yang dipakai
        //Jam selesai dikurang jam awal agar selisihnya bisa dikali untuk perhitungan detik begitu juga menit dan detik
        hitungWaktu = (jamAkhir - jamMulai) * 3600 +
                (menitAkhir - menitMulai) * 60 +
                (detikAkhir + detikMulai);
        System.out.println("Total Detik " + hitungWaktu);//output berapa detik pemakaian
    }
    public void hitungLagi(){
        //Membuat method void untuk hitung biaya
        //Karena biayanya 150 per 5 detik jadinya saya jadikan 30 per detik
        int hasilAkhir = hitungWaktu * 30;
        System.out.println("Biaya : " + hasilAkhir);//Output biayanya
    }

    public static void main(String[] args) {
        //Membuat method main memunculkan method sebelumnya
        UTSNomor1 akhir = new UTSNomor1();
        System.out.println("Selamat Datang di Ivan Wartel ");
        System.out.println("Silahkan Masukkan Waktu");
        System.out.println("---------------------------------------------------");
        akhir.mulai();//Input waktu pemkaian
        System.out.println("---------------------------------------------------");
        akhir.hitung();//output berapa detik pemakaian
        System.out.println("---------------------------------------------------");
        akhir.hitungLagi();//Biaya total
        System.out.println("TerimaKasih Telah Menggunakan Ivan Wartel");
    }

}
