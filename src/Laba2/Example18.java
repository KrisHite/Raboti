package Laba2;

import java.util.Scanner;

public class Example18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для проверки: ");
        int num = in.nextInt();
        if(num % 4 == 0 && num > 10){
            System.out.println("Число удовлетворяет критериям");
        }
        else {
            System.out.println("Число не удовлетворяет критериям");
        }
        in.close();
    }

}

//        3. Напишите программу, которая проверяет, удовлетворяет ли введенное
//        пользователем число следующим критериям: число делится на 4, и при
//        этом оно не меньше 10.