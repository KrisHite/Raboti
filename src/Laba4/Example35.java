package Laba4;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Example35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите колличество строк: ");
        int str = in.nextInt();
        System.out.println("Введите колличество столбцов: ");
        int sto = in.nextInt();
        Integer[][] arr = new Integer[str][sto];
        int[][] newArr = new int[sto][str];

        for(int i = 0; i < str; i++){
            for(int k = 0; k < sto; k++){
                arr[i][k] = rand.nextInt(200);
            }
        }
        System.out.println("Изначальный массив:");
        for(int i = 0; i < str; i++){
            for(int k = 0; k < sto; k++){
                System.out.print(arr[i][k] + " ");
            }
            System.out.println("");
        }

        for(int i = 0; i < sto; i++){
            for(int k = 0; k < str; k++){
                newArr[i][k] = arr[k][i];
            }
        }

        System.out.println("Массив после изменения:");
        for(int i = 0; i < sto; i++){
            for(int k = 0; k < str; k++){
                System.out.print(newArr[i][k] + " ");
            }
            System.out.println("");
        }


    }
}
//        5. Напишите программу, в которой создается двумерный целочисленный
//        массив. Он заполняется случайными числами. Затем в этом массиве строи и
//        столбцы меняются местами: первая строка становится первым столбцом,
//        вторая строка становиться вторым столбцом и так далее. Например, если
//        исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив
//        из 5 строк и 3 столбцов.