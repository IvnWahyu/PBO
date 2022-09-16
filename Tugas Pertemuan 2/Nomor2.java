import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kalimat = "Kalau dilakukan dengan sepenuh hati, maka besi batangan pun kalau digosok terus menerus akan menjadi jarum";
        String kata;
        System.out.println("Kalimat = " + kalimat);
        do {
            System.out.print("Masukkan kata yang ingin dicari di dalam kalimat : ");
            kata = sc.nextLine();
            if (kalimat.contains(kata)){
                System.out.println("Ketemu! ");
                System.out.println(kata + " ada di dalam kalimat ");
                break;
            }
            else{
                System.out.println("Tidak ketemu ");
                System.out.println(kata + " tidak ada di dalam kalimat");
            }
        }while(true);
    }
}
