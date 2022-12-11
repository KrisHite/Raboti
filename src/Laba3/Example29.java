package Laba3;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Example29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        if(size <= 0){                                              //Проверка на дурака
            System.out.println("Введено некорректное значение");
        }else {
            int[] arr = new int[size];
            Random rand = new Random();

            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(200);
            }
            int min = arr[0]+1;
            System.out.println(Arrays.toString(arr));

            for(int i = 0; i < arr.length; i++){//Находим минимальный эллемент массива
                if(arr[i] < min){
                    min = arr[i];
                }
            }
            System.out.println("Минимальный эллемент равен = " + min);

            for(int i = 0; i < arr.length; i++){//Находим минимальный эллемент массива
                if(arr[i] == min){
                    System.out.println("Индекс числа равен = " + i);
                }
            }


        }
    }
}

//        9. Напишите программу, в которой создается массив и заполняется
//        случайными числами. Массив отображается в консольном окне. В этом
//        массиве необходимо определить элемент с минимальным значением. В
//        частности, программа должна вывести значение элемента с минимальным
//        значением и индекс этого элемента. Если элементов с минимальным
//        значением несколько, должны быть выведены индексы всех этих элементов