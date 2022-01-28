package mainPac.method1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static String moreThanSeven() {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int scan = 0;
        try {
            scan = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Это не число, попробуйте еще");
        }
        return (scan > 7) ? "Привет" : "";
    }
}
