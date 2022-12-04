package Laba2;

import java.util.Scanner;

public class Example20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = in.nextInt();
        if(num / 1000 != 0){
            if (num < 0){
                num *= (-1);
            }
            System.out.println("Число состоит из " + num / 1000 + " тысяч");
        }
        else {
            System.out.println("Некорректное число");
        }
        in.close();
    }
}
//        5. Напишите программу, которая проверяет, сколько тысяч во введенном
//        пользователем числе (определяется четвертая цифра справа в десятичном
//        представлении числа).