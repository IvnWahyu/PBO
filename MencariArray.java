import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MencariArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] intArray = new Integer[]{10, 3, 40, 50, 15, 5, 7, 8};
        int nilai;
        List<Integer> intList = new ArrayList<>(Arrays.asList(intArray));
        System.out.print("Masukkan nilai : ");
        nilai = sc.nextInt();
        if(intList.contains(nilai)){
            System.out.println("Angka " + nilai + " ada pada array");
        }
        else {
            System.out.println("Angka " + nilai + " tidak ada pada array");
        }

    }
}
