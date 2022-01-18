import java.util.Scanner;

public class Task2 {
    private final static String firstName = "Вячеслав";

    public String getFirstName() {
        return firstName;
    }

    public static String isCorrect() {

        System.out.println("Введите имя: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String newName = name.replaceFirst("[а-я]", name.substring(0,1).toUpperCase());

        return (newName.equals(firstName) || name.equals(firstName)) ? "Привет, " + firstName : "Нет такого имени";
    }
}
