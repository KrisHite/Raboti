package Laba6.Example48;

import java.util.Arrays;

public class myClass {
    public static int min;//Минимум
    public static int max;//Максимум
    public static int mid;//Среднее значение

    public static void Numbers(int[] numbers){
        Arrays.sort(numbers);
        min = numbers[0];
        max = numbers[numbers.length - 1];
        mid = numbers[numbers.length / 2];
    }

    public static void Numbers(Integer... numbers){
        Arrays.sort(numbers);
        min = numbers[0];
        max = numbers[numbers.length - 1];
        mid = numbers[numbers.length / 2];
    }
}
