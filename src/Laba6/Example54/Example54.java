package Laba6.Example54;
import java.util.Arrays;
import java.util.Scanner;
public class Example54 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String words = in.nextLine();
        char[] charArr = words.toCharArray();
        System.out.println(Arrays.toString(charArr));
        System.out.println(Arrays.toString(myClass.CharArr(charArr)));
    }
}
//9. Напишите программу со статическим методом, аргументом которому передается
//одномерный символьный массив. В результате вызова метода элементы массива попарно
//меняются местами: первый — с последним, второй — с предпоследним и так далее.