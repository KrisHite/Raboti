package Laba3;

import java.util.Scanner;

public class Example26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int sizeArr = in.nextInt();
        if(sizeArr <= 0){
            System.out.println("Некорректное значение!");
        } else {
            int[] arr = new int[sizeArr];
            int i = 0;
            int num = 0;
            while(i < arr.length){
                if(num % 5 == 2){
                    arr[i] = num;
                    i++;
                }
                num++;
            }
            for(int k = 0; k < arr.length; k++){
                System.out.print(arr[k] + " ");
            }
        }

    }
}

//        6. Напишите программу, в которой создается одномерный числовой
//        массив и заполняется числами, которые при делении на 5 дают в остатке 2
//        (числа 2, 7,12,17 и так далее). Размер массива вводится пользователем.
//        Предусмотреть обработку ошибки, связанной с вводом некорректного
//        значения.
