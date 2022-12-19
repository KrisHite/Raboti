package Laba4;

public class Example33 {
    public static void main(String[] args) {
        int x = 10;//Длинна, ширина прямоугольника
        int y = 6;
        int[][] arr = new int[y][x];

        for(int i = 0; i < y; i++){
            for(int t = 0; t < x; t++){
                arr[i][t] = 2;
            }
        }

        for(int i = 0; i < y; i++){
            for(int t = 0; t < x; t++){
                System.out.print(arr[i][t]);
            }
            System.out.println("");
        }


    }
}

//    Напишите программу, в которой создается двумерный массив, который
//    выводит прямоугольник из цифр 2;