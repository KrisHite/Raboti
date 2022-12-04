package Laba2;

import java.util.Scanner;

public class Example16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для проверки: ");
        int num = in.nextInt();
        if(num % 3 == 0){
            System.out.println("Число делится на 3");
        }
        else {
            System.out.println("Число не делится на 3");
        }
        in.close();
    }
}
//        1. Напишите программу, которая проверяет, делится ли введенное
//        Пользователем число на 3.