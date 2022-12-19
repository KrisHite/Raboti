package Laba4;
import java.util.Scanner;

public class Example38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования");
        String word = in.nextLine();
        char[] wordArray = word.toCharArray();
        System.out.println("Введите ключ");
        int key = in.nextInt();
        char[] newWordArray = new char[wordArray.length];
        long[] intWord = new long[wordArray.length];
        //Преобразование
        for(int i = 0; i < wordArray.length; i++){
            intWord[i] = wordArray[i] + key;
            newWordArray[i] = (char)intWord[i];
        }
        //
        String str = new String(newWordArray);
        System.out.println("Текст после преобразования: " + str);
        boolean outCycle = false;
        while (outCycle == false) {
            System.out.println("Выполнить обратное преобразование? (y/n): ");
            char chose = in.next().charAt(0);
            switch (chose) {
                case ('y'):
                    for (int i = 0; i < wordArray.length; i++) {
                        intWord[i] = newWordArray[i] - key;
                        wordArray[i] = (char) intWord[i];
                    }
                    str = new String(wordArray);
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
//        8. Напишите программу «Шифр Цезаря», которая зашифровывает
//        введенный текст. Используете кодовую таблицу символов. При запуске
//        программы в консоль необходимо вывести сообщение: «Введите текст для
//        шифрования», после ввода текста, появляется сообщение: «Введите ключ».
//        После того как введены все данные, необходимо вывести преобразованную
//        строку с сообщением «Текст после преобразования : ». Далее необходимо
//        задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
//        если пользователь вводит «y», тогда выполнить обратное преобразование.
//        Если пользователь вводит «n», того программа выводит сообщение «До
//        свидания!». Если пользователь вводит что-то другое, отличное от «y» или «n»,
//        то программа ему выводит сообщение: «Введите корректный ответ».