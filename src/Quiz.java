import java.util.Arrays;
import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Определяем количество подмассивов
        System.out.print("Введите количество подмассивов: ");
        int numSubarrays = scanner.nextInt();

        // Создаем зубчатый массив
        int[][] jaggedArray = new int[numSubarrays][];
        int sum = 0;
        // Инициализация и заполнение подмассивов
        for (int i = 0; i < numSubarrays; i++) {
            System.out.print("Введите размер подмассива " + (i + 1) + ": ");
            int size = scanner.nextInt();
            jaggedArray[i] = new int[size];

            // Заполнение подмассива
            for (int j = 0; j < size; j++) {
                System.out.print("Введите значение для jaggedArray[" + i + "][" + j + "]: ");
                jaggedArray[i][j] = scanner.nextInt();
            }
        }

        // Вывод содержимого зубчатого массива
        System.out.println("Содержимое зубчатого массива:");
        for (int[] ints : jaggedArray) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
                sum += anInt;
            }
            System.out.println();
        }
        System.out.println(sum);
        scanner.close();
    }
}


