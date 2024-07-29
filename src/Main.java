//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        Сумма чисел от 1 до n.
//
//        Напишите программу, которая запрашивает у пользователя число n и использует цикл для вычисления суммы чисел от 1 до n.

        int sum = 0;
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.println(sum += i);
            }
        }

    }
}