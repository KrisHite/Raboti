package Laba4;

public class Example34 {
    public static void main(String[] args) {
        int x = 10;
        char[][] arr = new char[x][x];
        int n = 1;
        for(int i = 0; i < x; i++){
            for(int t = 0; t < x; t++){
                if(n > t){
                    arr[i][t] = '▮';//▮
                }else {
                    arr[i][t] = ' ';
                }
            }
            n++;
        }

        for(int i = 0; i < x; i++){
            for(int t = 0; t < x; t++){
                System.out.print(arr[i][t]);
            }
            System.out.println("");
        }
    }
}

//        4. Напишите программу, в которой создается двумерный массив, который
//        выводит прямоугольный треугольник;
