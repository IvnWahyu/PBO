public class LatMethod1 {
    static void welcome(String namaDepan, double absen, double tugas, double uts, double uas){
        System.out.println("Selamat Datang " + namaDepan);
        double nilaiAkhir = (0.1 * absen) + (0.2 * tugas) + (0.3 * uts) + (0.4 * uas);
        System.out.println("Nilai " + namaDepan + " adalah " + nilaiAkhir);
    }

    public static void main(String[] args) {
        String nd ="Hendi";
        double ab = 70;
        double tgs = 50;
        double uts = 100;
        double uas = 40;
        welcome(nd, ab, tgs, uts, uas);
    }
}
