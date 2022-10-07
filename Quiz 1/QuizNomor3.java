import java.util.Scanner;

public class QuizNomor3 {
    // Memasukkan attributt internet, pengetikkan, game, scan, print warna, print hitam putih dan teh botol
    private double inputInternet;
    private final int internet = 4000;
    private double inputPengetikan;
    private final int pengetikan = 2000;
    private double inputGame;
    private final int game = 5000;
    private final int menit = 60;
    private int inputScan;
    private int inputPrintWarna;
    private int inputPrintHtmPth;
    private int inputThebotol;
    // getter dan setter

    public void setInputInternet(double inputInternet) {
        this.inputInternet = inputInternet;
    }

    public void setInputPengetikan(double inputPengetikan) {
        this.inputPengetikan = inputPengetikan;
    }

    public void setInputGame(double inputGame) {
        this.inputGame = inputGame;
    }

    public void setInputScan(int inputScan) {
        this.inputScan = inputScan;
    }

    public void setInputPrintWarna(int inputPrintWarna) {
        this.inputPrintWarna = inputPrintWarna;
    }

    public void setInputPrintHtmPth(int inputPrintHtmPth) {
        this.inputPrintHtmPth = inputPrintHtmPth;
    }

    public void setInputThebotol(int inputThebotol) {
        this.inputThebotol = inputThebotol;
    }
    // Memasukkan hitungan internet, pengetikkan dan game
    public double hitungInternet(){
       return ((inputInternet /this.menit)* this.internet);

    }

    public double hitungPengetikan(){
        return ((inputPengetikan / this.menit)* this.pengetikan);
    }

    public double hitungGame(){
        return ((inputGame / this.menit)* this.game);
    }
    // Memasukkan hitungan untuk scan, print warna, hitam putih dan teh botol
    public int hitungSc(){
        return 1000 * inputScan;
    }
    public int hitungPrintWarna(){
        return 500 * this.inputPrintWarna;
    }
    public int hitungPrintHtmPth(){
        return 300 * inputPrintHtmPth;
    }
    public int hitungTehBotol(){
        return 3000 * this.inputThebotol;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Memasukkan input dan output internet
        QuizNomor3 internet = new QuizNomor3();
        System.out.print("\nMasukkan pemakaian internet : ");
        internet.setInputInternet(input.nextInt());
        System.out.println("Harga pemakaian internet : " + internet.hitungInternet());
        //Memasukkan input dan output pengetikkan
        QuizNomor3 pengetikan = new QuizNomor3();
        System.out.print("\nMasukkan pemakaian pengetikan : ");
        pengetikan.setInputPengetikan(input.nextDouble());
        System.out.println("Harga pemakaian pengetikan : " + pengetikan.hitungPengetikan());
        //Memasukkan input dan output game
        QuizNomor3 game = new QuizNomor3();
        System.out.print("\nMasukkan pemakaian game : ");
        game.setInputGame(input.nextDouble());
        System.out.println("Harga pemakaian game : " + game.hitungGame());
        //Memasukkan input dan output scan
        QuizNomor3 scan = new QuizNomor3();
        System.out.print("\nMasukkan lembar scan : ");
        scan.setInputScan(input.nextInt());
        System.out.println("Harga scan : " + scan.hitungSc());
        //Memasukkan input dan output print warna
        QuizNomor3 printWarna = new QuizNomor3();
        System.out.print("\nMasukkan lembar print warna : ");
        printWarna.setInputPrintWarna(input.nextInt());
        System.out.println("Harga print warna : " + printWarna.hitungPrintWarna());
        //Memasukkan input dan output print hitam putih
        QuizNomor3 printHtmPth = new QuizNomor3();
        System.out.print("\nMasukkan lembar print hitam putih : ");
        printHtmPth.setInputPrintHtmPth(input.nextInt());
        System.out.println("Harga print hitam putih : " + printHtmPth.hitungPrintHtmPth());
        //Memasukkan input dan output teh botol
        QuizNomor3 tehBotol = new QuizNomor3();
        System.out.print("\nMasukkan teh botol : ");
        tehBotol.setInputThebotol(input.nextInt());
        System.out.println("Harga teh botol = " + tehBotol.hitungTehBotol());
        //Memasukkan output total tagihan
        System.out.println("Total tagihan : " + internet.hitungInternet() + pengetikan.hitungPengetikan() + game.hitungGame() + scan.hitungSc() +
                printWarna.hitungPrintWarna() + printHtmPth.hitungPrintHtmPth() + tehBotol.hitungTehBotol());
    }

}
