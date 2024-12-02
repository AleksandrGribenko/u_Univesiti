package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    /**
     * Необходимо написать программу, которая дописывает файл.
     * Программа предлагает записать данные фразой "Вводите данные для записи".
     * После того, как введены данные в консоль (необходимо использовать класс Scanner для ввода данных в консоль),
     * программа предлагает дополнить информацию фразой «Введите что-нибудь еще» и данные можно дописать.
     * Вся работа по заполнению файла ведется в бесконечном цикле.
     * Если пользователь введет 0, программа завершается строкой «Файл создан».
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Вводите данные для записи");
        String info;
        Scanner scanner = new Scanner(System.in);
        File file = new File("D://MyFile/writeAndReadFile.txt");
        FileWriter writer = new FileWriter(file, true);
        while (true){
            info = scanner.next();
            if(!info.equals("0")){
                writer.write('\n' + info);
                System.out.println("Введите что-нибудь еще");
            }else {
                writer.close();
                System.out.println("Файл создан");
                return;
            }
        }
    }
}