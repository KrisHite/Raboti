package Laba2;

import java.util.Scanner;

public class Example17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для проверки: ");
        int num = in.nextInt();
        if(num % 5 == 2 && num % 7 == 1){
            System.out.println("Число удовлетворяет требованиям");
        }
        else {
            System.out.println("Число неудовлетворяет требованиям");
        }
        in.close();
    }
}

//        2. Напишите программу, которая проверяет, удовлетворяет ли введенное
//        пользователем число следующим критериям: при делении на 5 в остатке
//        получается 2, а при делении на 7 в остатке получается 1.