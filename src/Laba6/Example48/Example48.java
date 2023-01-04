package Laba6.Example48;

import java.util.Arrays;

public class Example48 {
    public static void main(String[] args) {
        int[] numbersIn = new int[]{1, 6, 10, 22, 0 , 35};
        System.out.println("Массив: " + Arrays.toString(numbersIn));
        myClass.Numbers(numbersIn);//Вызов метода с массивом в качестве аргумента
        System.out.println("Вызов метода с массивом в качестве аргумента");
        System.out.println("Минимальное значение: " + myClass.min);
        System.out.println("Максимальное значение: " + myClass.max);
        System.out.println("Среднее значение: " + myClass.mid);
        System.out.println("Вызов метода с произвольным колличеством аргументов");
        myClass.Numbers(3, 7, 5, 3, -2, 8, 33, 26, 55, 200);//Вызов метода с произвольным колличеством аргументов
        System.out.println("Минимальное значение: " + myClass.min);
        System.out.println("Максимальное значение: " + myClass.max);
        System.out.println("Среднее значение: " + myClass.mid);

    }
}
//          3. Напишите программу с классом, в котором есть статические методы, которым
//        можно передавать произвольное количество целочисленных аргументов (или
//        целочисленный массив). Методы, на основании переданных аргументов или массива,
//        позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
//        значение из набора чисел