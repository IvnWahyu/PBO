import java.util.Random;
import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            String[] suit = {"J", "T", "K"};
            String komputer = suit[new Random().nextInt(suit.length)];
            String tangan;
            String mainLagi;

            while(true){
                System.out.println("Masukkan jari [J/T/K] : ");
                tangan = sc.nextLine();
                if (tangan.equals("J")||tangan.equals("T")||tangan.equals("K")){
                    break;
                }
                System.out.println(tangan + "?");
            }
            System.out.println("Komputer " + komputer);

            if (tangan.equals(komputer)){
                System.out.println("Jawaban sama!");
            }
            else if (tangan.equals("T")) {
                if (komputer.equals("K")){
                    System.out.println("Eh kok menang ");
                }
                else if (komputer.equals("J")){
                    System.out.println("Jiaah kalah");
                }
            }
            else if (tangan.equals("J")) {
                if (komputer.equals("T")){
                    System.out.println("Eh kok menang ");
                }
                else if (komputer.equals("K")) {
                    System.out.println("Jiaah kalah");
                }
            }
            else if (tangan.equals("K")) {
                if(komputer.equals("J")){
                    System.out.println("Eh kok menang ");
                }
                else if (komputer.equals("T")) {
                    System.out.println("Jiaah kalah");
                }

            }
            System.out.println("Main lagi bang ? (skip/ayo) :");
            mainLagi = sc.nextLine();

            if (mainLagi.equals("skip")){
                break;
            }
        }
        sc.close();
    }
}
