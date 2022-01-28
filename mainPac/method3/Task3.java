package mainPac.method3;

import java.util.*;
import java.util.stream.Collectors;

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

    public static List<Integer> dividedNumbers(int[] inputsArr) {

        List<Integer> arr = new LinkedList<>();
        for (Integer ar: inputsArr) {
            arr.add(ar);
        }

        return arr.stream()
                .filter(a -> a % 3 == 0)
                .collect(Collectors.toList());
        //Integer[] arr1 = arr.toArray(new Integer[0]);
    }

}
