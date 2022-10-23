import java.util.Scanner;
// Nama : Ivan Wahyu Putratama
// NIM  : 2021071022
public class TugasMandiri {
    private int jamLembur;
    private int inputJamKerja;
    private int inputGolongan;

    public void lamaJamLembur(){
        Scanner jam = new Scanner(System.in);
        System.out.print("Masukkan Jam Kerja : ");
        inputJamKerja = jam.nextInt();
    }

    public void hitungJamLembur(){
        jamLembur = inputJamKerja - 173;
        System.out.println("Lama Jam Lembur " + jamLembur + " Jam");
    }
    public void duitLembur(){
        if (jamLembur>=1){
            int adaJamLembur = jamLembur * 20000;
            System.out.println("Duit Lembur : " + adaJamLembur);
        }else{
            System.out.println("Tidak ada Jam Lembur");
        }
    }
   public void golongan(){
       Scanner golongan = new Scanner(System.in);
       System.out.print("Masukkan Golongan Karyawan : ");
       inputGolongan = golongan.nextInt();
       System.out.println("Golongan Karyawan Anda adalah : "+ inputGolongan);
   }

   public void hitungGaji(){
        if (inputGolongan==1){
            int gajiPokok1 = 1486500;
            int tunjangan1 = 250000;
            System.out.println("Gaji Pokok anda adalah Rp "+ gajiPokok1);
            System.out.println("Tunjangan anda adalah Rp "+ tunjangan1);
            double pajak1 = (gajiPokok1 + tunjangan1) - ((gajiPokok1 * 0.005) + (tunjangan1 * 0.005));
            System.out.println("Total Gaji dan tunjangan anda : Rp " +pajak1);
        } else if (inputGolongan==2) {
            int gajiPokok2 = 1926500;
            int tunjangan2 = 300000;
            System.out.println("Gaji Pokok anda adalah Rp " + gajiPokok2);
            System.out.println("Tunjangan anda adalah Rp " + tunjangan2);
            double pajak2 = (gajiPokok2 + tunjangan2)- ((gajiPokok2 * 0.005) + (tunjangan2 + 0.005));
            System.out.println("Total Gaji dan tunjangan anda : Rp " + pajak2);
        } else if (inputGolongan==3) {
            int gajiPokok3 = 2456700;
            int tunjangan3 = 350000;
            System.out.println("Gaji Pokok anda adalah Rp " + gajiPokok3);
            System.out.println("Tunjangan anda adalah Rp " + tunjangan3);
            double pajak3 = (gajiPokok3 + tunjangan3) - ((gajiPokok3 * 0.005) + (tunjangan3 + 0.005));
            System.out.println("Total Gaji dan tunjangan anda : Rp " + pajak3);
        } else if (inputGolongan==4) {
            int gajiPokok4 = 2899500;
            int tunjangan4 = 400000;
            System.out.println("Gaji Pokok anda adalah Rp " + gajiPokok4);
            System.out.println("Tunjangan anda adalah Rp " + tunjangan4);
            double pajak4 = (gajiPokok4 + tunjangan4) - ((gajiPokok4 * 0.005) + (tunjangan4 + 0.005));
            System.out.println("Total Gaji dan tunjangan anda : Rp " + pajak4);
        }else {
            System.out.println("Anda Bukan Karyawan Sini");
        }
   }

    public static void main(String[] args) {
        TugasMandiri selesai = new TugasMandiri();
        System.out.println("Slip Gaji");
        System.out.println("------------------------");
        selesai.lamaJamLembur();
        System.out.println("------------------------");
        selesai.hitungJamLembur();
        System.out.println("------------------------");
        selesai.duitLembur();
        System.out.println("------------------------");
        selesai.golongan();
        System.out.println("------------------------");
        selesai.hitungGaji();
        System.out.println("------------------------");
        System.out.println("TERIMA KASIH");
    }
}
