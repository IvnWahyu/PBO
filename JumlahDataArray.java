public class JumlahDataArray {
    public static void main(String[] args) {
        int [] angka = {10, 3, 40, 50, 15, 5, 7, 8};
        int total = 0;
        for (int i =0;i<angka.length;i++){
            total = total + angka[i];
        }
        System.out.println("Jumlah data array : " + total);
    }
}
