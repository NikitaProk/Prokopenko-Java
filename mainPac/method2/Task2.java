package mainPac.method2;

import java.util.Scanner;

public class Task2 {
    private final static String FIRSTNAME = "Вячеслав";

    public String getFirstName() {
        return FIRSTNAME;
    }

    public static String isCorrect() {

        System.out.println("Введите имя: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String newName = name.replaceFirst("[а-я]", name.substring(0,1).toUpperCase());

        return (newName.equals(FIRSTNAME) || name.equals(FIRSTNAME)) ? "Привет, " + FIRSTNAME : "Нет такого имени";
    }
}
