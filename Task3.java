import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {


    public static int[] newArr() {
        System.out.println("\nВведите длину массива: ");
        Scanner scan = new Scanner(System.in);
        int sizeArr = 0;
        try {
            sizeArr = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введите число!");
        }
        int[] inputsArr = new int[sizeArr];

        System.out.println("\nВведите элементы массива: ");
        for (int i = 0; i < sizeArr; i++) {
            try {
                inputsArr[i] = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Введите число!");
            }
        }
        return inputsArr;
    }

    public static Integer[] dividedNumbers(int[] inputsArr) {

        ArrayList<Integer> arr = new ArrayList<>();
        for (int j : inputsArr) {
            if (j % 3 == 0) {
                arr.add(j);
            }
        }
        Integer[] arr1 = arr.toArray(new Integer[0]);
        return arr1;
    }
}
