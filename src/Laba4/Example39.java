package Laba4;
import java.util.Scanner;
public class Example39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefjhijklmnopqrstuvwxyz.,?!1234567890 ";//Создаю алфавит
        char[] abc = ABC.toCharArray();//Алфавит преобразую в массив
        System.out.println("Введите текст для шифрования на латинице");
        String words = in.nextLine();
        char[] charWords = words.toCharArray();//Текст для шифрования в массив
        long[] numberOfChar = new long[charWords.length];//Индексы символов в алфавите

        for (int i = 0; i < charWords.length; i++) {//Преобразую буквы в числа
            for (int k = 0; k < abc.length; k++) {
                if (charWords[i] == abc[k]) {
                    numberOfChar[i] = k;
                }
            }
        }

        System.out.println("Введите ключ");
        int key = in.nextInt();

        for (int i = 0; i < key; i++) {//прямое преобразование
            char n = abc[0];
            for (int k = 1; k < abc.length; k++) {
                abc[k - 1] = abc[k];
            }
            abc[abc.length - 1] = n;
        }
        char[] newCharWords = new char[charWords.length];

        for (int i = 0; i < numberOfChar.length; i++) {//Преобразую числа в буквы
            newCharWords[i] = abc[(int) numberOfChar[i]];
        }
        String str = new String(newCharWords);
        System.out.println("Текст после преобразования: " + str);

        boolean outCycle = false;
        while (outCycle == false) {
            System.out.println("Выполнить обратное преобразование? (y/n): ");
            char chose = in.next().charAt(0);
            switch (chose) {
                case ('y'):
                    for (int i = 0; i < key; i++) {//Обратное преобразование алфавита
                        char n = abc[abc.length - 1];
                        for (int k = abc.length - 1; k > 0; k--) {
                            abc[k] = abc[k - 1];
                        }
                        abc[0] = n;
                    }
                    for (int i = 0; i < numberOfChar.length; i++) {//Преобразую числа в буквы
                        newCharWords[i] = abc[(int) numberOfChar[i]];
                    }
                    str = new String(newCharWords);
                    System.out.println("Строка после обратного преобразования: " + str);
                    outCycle = true;
                    break;
                case ('n'):
                    System.out.println("До свидания!");
                    outCycle = true;
                    break;
                default:
                    System.out.println("Введите корректный ответ");
                    break;

            }
        }
    }
}
//        9* (дополнительная задача). Напишите программу «Шифр Цезаря», в которой
//        необходимо реализовать собственный алфавит, остальные условия идентичны
//        задаче 8.