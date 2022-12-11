package Laba3;

import java.util.Scanner;

public class Example23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите колличество чисел в последовательноси: ");
        int num = in.nextInt();
        int [] arrFib = new int[num];
        arrFib[0] = 1;
        arrFib[1] = 1;
        for(int i = 2; i < arrFib.length; i++){
            arrFib[i] = arrFib[i-1] + arrFib[i-2];
        }
        for(int i = 0; i < arrFib.length; i++){
            System.out.print(arrFib[i] + " ");
        }
    }
}

//        3. Напишите программу, которая выводит последовательность чисел
//        Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
//        следующее число равно сумме двух предыдущих
//        (получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел
//        в последовательности вводится пользователем. Предложите версии
//        программы, использующие разные операторы цикла.