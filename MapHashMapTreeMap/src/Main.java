import java.util.HashMap;
import java.util.Map;

public class Main {
    /**
     * Создайте HashMap c ключами Integer, значениями – String.
     * Напишите метод, который возвращает набор ключей, содержащихся в этой карте.
     * 0 - черный, 1-синий, 2 - зеленый, 3 - голубой, 4 - красный, 5 - пурпурный, 6 - желтый, 7 - белый.
     */
    public static void main(String[] args) {
        HashMap<Integer, String> color = new HashMap<>();
        color.put(0, "black");
        color.put(1, "blue");
        color.put(2, "green");
        color.put(3, "lightBlue");
        color.put(4, "red");
        color.put(5, "purple");
        color.put(6, "yellow");
        color.put(7, "white");

        for (Map.Entry colors: color.entrySet()) {
            System.out.print(colors.getKey()+" ");
        }
        System.out.println();
        System.out.println(color);

        /** Создайте HashMap c ключами Integer, значениями – String.
         * Напишите метод, который возвращает ассоциативный массив, состоящий из элементов исходного map, при условии,
         * что туда войдут элементы с длиной строки более 3.
         * Т.е. исходный map: [1="Red",2="Green",3="Black"].
         * Новый map: [2="Green",3="Black"].
         */
        HashMap<Integer, String> color2 = new HashMap<>();
        color2.put(1, "Red");
        color2.put(2, "Green");
        color2.put(3, "Black");
        HashMap<Integer, String> color3 = new HashMap<>();
        System.out.println(color2);
        for (Map.Entry colors : color2.entrySet()) {
            if (((String) colors.getValue()).length() > 3) {
                color3.put((Integer) colors.getKey(), (String) colors.getValue());
            }
        }
        System.out.println(color3);
    }

}
