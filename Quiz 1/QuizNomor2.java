import java.util.Scanner;
public class QuizNomor2 {
    //Buat aplikasi OOP untuk menghitung biaya percakapan melalui phonecell, Dimana waktu awal dan waktu selesai percakapan (hh:mm:ss)
    //diinput melalui keyboard.
    //Keluaran dari aplikasi ini adalah lama dan biaya percakapan.
    //Satu pulsa = 5 detik dan biaya per pulsa adalah Rp. 150

	//Membuat attribut jam, menit, dan detik
    private int jam = 0;
	private int menit = 0;
	private int detik = 0;

	//Membuat inisiallisasi lamadetik untuk convert
	public QuizNomor2 durasiKe(QuizNomor2 masaDepan) {
		QuizNomor2 waktu = new QuizNomor2();
		int lamaDetik = (masaDepan.jam - this.jam) * 3600 + (masaDepan.menit - this.menit) * 60 + (masaDepan.detik - this.detik);
		waktu.jam = lamaDetik / 3600;
		lamaDetik = lamaDetik % 3600;
		waktu.menit = lamaDetik / 60;
		lamaDetik = lamaDetik % 60;
		waktu.detik = lamaDetik;
		return waktu;
	}


	public static void main(String[] args) {
        System.out.println("-----------------------------------------------");
		System.out.println("Selamat Datang di Budi PhoneCell ");
		System.out.println("Silahkan input waktu ");
		Scanner input = new Scanner(System.in);

		// Membuat input untuk memasukkan durasi yang mulai diinginkan
		QuizNomor2 mulai = new QuizNomor2();
		System.out.print("Waktu mulai ");
		System.out.print("\njam  : ");
		mulai.jam = input.nextInt();
		System.out.print("menit: ");
		mulai.menit = input.nextInt();
		System.out.print("detik: ");
		mulai.detik = input.nextInt();
		System.out.println("-----------------------------------------------");

		// Membuat input memasukkan durasi yang akhir diinginkan
		QuizNomor2 selesai = new QuizNomor2();
		System.out.println("-----------------------------------------------");
		System.out.print("Waktu selesai ");
		System.out.print("\njam  : ");
		selesai.jam = input.nextInt();
		System.out.print("menit: ");
		selesai.menit = input.nextInt();
		System.out.print("detik: ");
		selesai.detik = input.nextInt();
        System.out.println("-----------------------------------------------");
		// Membuat if else
		// Jika durasi akhir lebih kecil maka akan salah input
		// Jika benar maka akan membuat output berapa lama durasi dan juga biaya tagihannya
		if (selesai.jam < mulai.jam) {
			System.out.println("Salah Input");
		} else {
			QuizNomor2 waktu = mulai.durasiKe(selesai);
			System.out.println("Lama durasi : " + waktu.jam + " jam " + waktu.menit + " menit " + waktu.detik + " detik");
			int lamaDurasi = (waktu.jam * 3600) + (waktu.menit * 60) + waktu.detik;
			System.out.println("Biaya : Rp " + lamaDurasi*30);
		}
	}
}
