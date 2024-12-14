package Set_HashSet_LinkedHashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    /**
     * Домашнее задание SetHash SetLinked HashSet TreeSet
     * Создайте два набора, хранящих в себе элементы строкового типа, характеризующие цвет чего – либо.
     * Напишите метод для сравнения двух наборов и сохранения элементов, которые одинаковы для обоих наборов.
     * Создайте множество целых чисел. Необходимо вывести в консоль все его элементы, которые больше 15 и являются четными.
     * Остальные элементы набора тоже необходимо вывести в консоль, но каждый из них разделив на 2.
     */
    public static void main(String[] args) {
//Создайте два набора, хранящих в себе элементы строкового типа, характеризующие цвет чего – либо
// Напишите метод для сравнения двух наборов и сохранения элементов, которые одинаковы для обоих наборов.

        Set<String> hashSet1 = new HashSet<>();
        Set<String> hashSet2 = new HashSet<>();

        hashSet1.add("Красный");
        hashSet1.add("Зеленый");
        hashSet1.add("Синий");

        hashSet2.add("Синий");
        hashSet2.add("Желтый");
        hashSet2.add("Красный");

        Set<String> commonHashSet = getCommonElements(hashSet1, hashSet2);
        System.out.println("Общие цвета (HashSet): " + commonHashSet);

//  Создайте множество целых чисел. Необходимо вывести в консоль все его элементы, которые больше 15 и являются четными.
//  Остальные элементы набора тоже необходимо вывести в консоль, но каждый из них разделив на 2.

        Set<Integer> treeSet = new TreeSet<>();
        fillSet(treeSet);
        System.out.println("TreeSet:");
        processOne(treeSet);
        processTwo(treeSet);
    }
    private static void fillSet(Set<Integer> set) {
        set.add(5);
        set.add(18);
        set.add(12);
        set.add(20);
        set.add(27);
        set.add(8);
        set.add(15);
        set.add(22);
        set.add(10);
    }
    private static void processOne(Set<Integer> set) {
        for (Integer num : set) {
            if (num > 15 && num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
    private static void processTwo(Set<Integer> set){
        for (Integer num : set) {
            if (!(num > 15 && num % 2 == 0)) {
                System.out.println(num / 2.0);
            }
        }
    }
    public static Set<String> getCommonElements(Set<String> set1, Set<String> set2) {
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }
}