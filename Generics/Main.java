package Generics;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Напишите метод, который принимает два массива одного типа и проверяет,
 * содержат ли они одинаковые элементы в одном и том же порядке.
 * Напишите универсальный метод, чтобы обмениваться позициями двух различных элементов в массиве.
 */


public class Main {
    public static void main(String[] args) {

        Integer[] array = {1, 2, 3, 4, 3, 5};
        Integer[] arrayTwo = {2, 3, 4, 5, 6};

        String str = "Hello word!";
        String strTwo = "hello word!";
        if (myComp(strTwo, str)) {
            System.out.println("YES");
        } else System.out.println("NO");
        if (myComp(strTwo, strTwo)) {
            System.out.println("YES");
        } else System.out.println("NO");
        if (myComp(array, arrayTwo)) {
            System.out.println("YES");
        } else System.out.println("NO");
        str = myChange(str);
        System.out.print(str);
    }

    //Напишите универсальный метод, чтобы обмениваться позициями двух различных элементов в массиве.
    static <T> void myChange(T[] vol) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        do {
            a = scanner.nextInt();
            b = scanner.nextInt();
        } while (!((a > 0) && (a < vol.length) && (b > 0) && (b < vol.length)));
        T tmp = vol[a];
        vol[a] = vol[b];
        vol[b] = tmp;
    }

    static <T> T myChange(String vol) {
        char[] volume =  vol.toCharArray();
        //volume =;
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        do {
            a = scanner.nextInt();
            b = scanner.nextInt();
        } while (!((a > 0) && (a < volume.length) && (b > 0) && (b < volume.length)));
        char tmp = volume[a];
        volume[a] = volume[b];
        volume[b] = tmp;

        return (T) new String(volume);

    }

    //  Напишите метод, который принимает два массива одного типа и проверяет, содержат ли они одинаковые элементы в одном и том же порядке.
    static <T> boolean myComp(T[] volOne, T[] volTwo) {

        return Arrays.equals(volOne, volTwo);
    }
    static <T> boolean myComp(String volOne, String volTwo) {

        return Arrays.equals(new String[]{volOne}, new String[]{volTwo});
    }
}







