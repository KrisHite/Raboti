package Laba6.Example50;
import java.util.Scanner;
public class Example50 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = in.nextInt();
        System.out.println(myClass.Nums(num));//Вызов метода
        int res = (num*(num + 1)*(2*num + 1))/6;//Проверка
        System.out.println(res);
    }
}
//        5. Напишите программу со статическим методом, которым вычисляется сумма
//        квадратов натуральных чисел 1
//        2 + 22 + 32 + ... + п
//        2
//        . Число п передается аргументом методу.
//        Для проверки результата можно использовать формулу 12 + 22 +3
//        2+…+n
//        2=
//        (n+l) (2n + 1)/6