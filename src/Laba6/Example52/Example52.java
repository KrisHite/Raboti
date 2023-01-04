package Laba6.Example52;
import java.util.Arrays;
import java.util.Scanner;
public class Example52 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String words = in.nextLine();
        char[] charArray = words.toCharArray();
        System.out.println(Arrays.toString(charArray));
        System.out.println(Arrays.toString(myClass.charToInt(charArray)));
    }
}
//        7. Напишите программу со статическим методом, аргументом которому передастся
//        символьный массив, а результатом возвращается ссылка на целочисленным массив,
//        состоящий из кодов символов из массива- аргумента.