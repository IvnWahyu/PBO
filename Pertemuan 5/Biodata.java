package LatihanClass3a;

public class Biodata {
    private String nim;
    private String nama;
    private int umur;
    private String prodi;
    private String kelamin;

    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getProdi() {
        return prodi;
    }
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getKelamin() {
        String kelamin = "Perempuan";
        if (this.kelamin == "L"){
            kelamin = "Laki-laki";
        }
        return kelamin;
    }
    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }
    public static void main(String[] args) {
        Biodata biodata = new Biodata();
        biodata.setNim("2021001");
        biodata.setNama("Dodi");
        biodata.setUmur(20);
        biodata.setProdi("Informatika");
        biodata.setKelamin("L");

        System.out.println("NIM     : " + biodata.getNim());
        System.out.println("Nama    : " + biodata.getNama());
        System.out.println("Umur    : " + biodata.getUmur() + " Tahun");
        System.out.println("Prodi   : " + biodata.getProdi());
        System.out.println("Kelamin : " + biodata.getKelamin());
    }
}
