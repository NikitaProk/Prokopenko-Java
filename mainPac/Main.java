package mainPac;

import mainPac.method2.Task2;
import mainPac.method3.Task3;
import mainPac.method1.Task1;

public class Main {
    public static void main(String[] args) {
        //Вывод первого задания
        System.out.println(Task1.moreThanSeven());

        //Вывод второго задания
        System.out.println(Task2.isCorrect());

        //Вывод третьего задания
        System.out.println(Task3.dividedNumbers(Task3.newArr()));
    }
}
