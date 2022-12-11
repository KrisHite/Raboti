package Laba3;

import java.util.Scanner;

public class Example25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите колличество чисел: ");
        int sizeSum = in.nextInt();
        int result = 0;

        int i = 0;

        if(sizeSum <= 0){
            System.out.println("Некорректное значение!");
        } else {
            int[] arr = new int[sizeSum];
            while(i < arr.length){

                if(result % 5 == 2 && result % 3 == 1){
                    arr[i] = result;
                    i++;
                }
                result++;
            }
            result = 0;
            for(int k = 0; k < arr.length; k++){
                System.out.print(arr[k] + " ");
                result += arr[k];
            }
            System.out.println(" ");
            System.out.println("Сумма чисел равна: " + result);
        }

    }
}
//        5. Напишите программу, в которой вычисляется сумма чисел,
//        удовлетворяющих таким критериям: при делении числа на 5 в остатке получается 2,
//        или при делении на 3 в остатке получается 1. Количество чисел в сумме
//        вводится пользователем. Программа отображает числа, которые
//        суммируются, и значение суммы. Предложите версии программы,
//        использующие разные операторы цикла.