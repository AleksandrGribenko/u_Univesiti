package Exception;

import java.util.Scanner;

public class Main {
    /**
     * Напишите метод, который принимает целое число в качестве параметра и выдает исключение, если число нечетное.
     * Необходимо протестировать ее в методе main с разными числами.
     * ***Напишите метод, который принимает строку в качестве входных данных и выдает исключение, если строка содержит числа.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a % 2 != 0) {
            throw new ArithmeticException("Ошибка! Число нечетное");
        }
        System.out.println("Введено число: " + a);
        String str = scan.next();
        int n = str.length();
        char[] arr = new char[n];
        arr = str.toCharArray();
        for (int i = 0; i < n; i++) {
            //48 - 57
            if (arr[i] >= 48 && arr[i] <= 57) {
                throw new ArrayStoreException("В строке имеется число");
            }
        }
        System.out.println("Введена строка: " + str);
    }
}