import java.util.Scanner;

public class LatihanLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jwb = "y";
        while (jwb.equals("y")){
            System.out.println("halo selamat datang.");
            System.out.print("Apakah ingin mengulang lagi [y] ? " );
            jwb = sc.nextLine();
        }
        System.out.println("Terima kasih telah menggunakan program ini");
    }
}
