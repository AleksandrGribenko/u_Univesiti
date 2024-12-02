package CollectionListArrayListLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * Создайте ArrayList, содержащий разные цвета, тип элемента этого динамического массива – String.
     * Напишите метод для поиска элемента в списке , содержащем эти цвета. На вход метод принимает параметр поиска.
     * Например, если список содержит «red», «blue», «green» и в аргументы метода передать «red», то метод должен вернуть true,
     * символизируя то, что этот цвет содержится в списке.
     */
    public static void main(String[] args) {
        List<String> rainbow = new ArrayList<>();
        rainbow.add("red");
        rainbow.add("orange");
        rainbow.add("yellow");
        rainbow.add("green");
        rainbow.add("lightBlue");
        rainbow.add("blue");
        rainbow.add("violet");
        Scanner scan = new Scanner(System.in);

        if (rainbow.contains(scan.next())) {
            System.out.println("true");
        } else System.out.println("false");
        System.out.println(rainbow);
        System.out.println();
/**
 *      Создайте LinkedList, содержащий целые числа, т.е. Integer.
 *      Напишите метод, который меняет местами первый и последний элементы этого списка и возвращает этот список в новом виде.
 *      Т.е., если создали список [1, 2, 3, 4, 5], то в результате должны получить [5, 2, 3, 4, 1].
 */
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Integer tmp = list.get(0);
        Integer tmp2 = list.get(list.size()-1);
        list.set(0,tmp2);
        list.set(((list.size())-1),tmp);
        System.out.println(list);
    }
}