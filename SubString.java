public class SubString {
    public static void main(String[] args) {
        String nim = "2021071022";
        double nilaiTotal = 80;
        String nilaiHuruf;
        String KodeProdi = nim.substring(4,7);
        String angkatan = nim.substring(0,4);
        String namaProdi = "";
        System.out.println("Kode Prodi = " + KodeProdi);
        System.out.println("Angkatan = "+ angkatan);
        if (KodeProdi.equals("071")){
            namaProdi = "Informatika";
        }
        System.out.println("NIM : " + nim);
        System.out.println("Nama Prodi : "+ namaProdi);
        if (nilaiTotal >= 80){
            nilaiHuruf ="A";
        }
        else if (nilaiTotal >= 70){
            nilaiHuruf ="B";
        }
        else if (nilaiTotal >= 60){
            nilaiHuruf ="C";
        }
        else if (nilaiTotal >= 50){
            nilaiHuruf ="D";
        }
        else {
            nilaiHuruf ="E";
        }
        System.out.println("Nilai Total = " + nilaiHuruf);
    }
}

