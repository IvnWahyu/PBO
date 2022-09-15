public class RataArray {
    public static void main(String[] args) {
        int [] angka = {10, 3, 40, 50, 15, 5, 7, 8};
        float total = 0;
        float rata;
        for (int i =0;i<angka.length;i++){
            total = total + angka[i];
        }
        System.out.println("Jumlah array : " + total);
        rata = total/angka.length;
        System.out.println("Rata rata :" + rata);
    }
}
