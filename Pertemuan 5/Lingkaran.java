package TugasPertemuan5;

public class Lingkaran {
    private int jari;
    private double phi = 3.14;

    public void setPhi(double phi) {
        this.phi = phi;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }

    public double hitungLingkaran() {
        return phi * jari * jari;
    }

}
