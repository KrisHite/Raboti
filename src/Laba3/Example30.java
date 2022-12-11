package Laba3;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;

public class Example30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        Integer[] arr = new Integer[size];
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(200);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
//        10. Напишите программу, в которой создается целочисленный
//        массив, заполняется случайными числами и после этого значения элементов в
//        массиве сортируются в порядке убывания значений.