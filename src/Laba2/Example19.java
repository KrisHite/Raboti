package Laba2;

import java.util.Scanner;

public class Example19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для проверки: ");
        int num = in.nextInt();
        if(num >= 5 && num <= 10){
            System.out.println("Число удовлетворяет требованиям");
        }
        else {
            System.out.println("Число неудовлетворяет требованиям");
        }
        in.close();
    }

}
//        4. Напишите программу, которая проверяет, попадает ли введение
//                пользователем число в диапазон от 5 до 10 включительно.