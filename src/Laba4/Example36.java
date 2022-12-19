package Laba4;

import java.util.Scanner;
import java.util.Random;

public class Example36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите колличество строк: ");
        int str = in.nextInt();
        System.out.println("Введите колличество столбцов: ");
        int sto = in.nextInt();
        Integer[][] arr = new Integer[str][sto];
        Integer[][] newArr = new Integer[str][sto];
        int delStr = rand.nextInt(str - 1);
        int delSto = rand.nextInt(sto - 1);

        if(str <= 0 ||  sto <= 0){
            System.out.println("Некорректные данные!");
        }else {
            for(int i = 0; i < str; i++){//Создаю массив, заполняю рандомами
                for(int k = 0; k < sto; k++){
                    arr[i][k] = rand.nextInt(100);
                }
            }
            System.out.println("Изначальный массив:");
            for(int i = 0; i < str; i++){
                for(int k = 0; k < sto; k++){
                    System.out.print(arr[i][k] + " ");
                }
                System.out.println("");
            }
            //Преобразование массива

            for (int i = 0; i < str; i++){//удаление столбца+
                for(int k = delSto; k < sto - 1; k++){
                    arr[i][k] = arr[i][k + 1];
                }
            }
            for (int i = delStr; i < str - 1; i++){//удаление строку
                for(int k = 0; k < sto; k++){
                    arr[i][k] = arr[i + 1][k];
                }
            }

            for (int i = 0; i < str - 1; i++){
                for(int k = 0; k < sto - 1; k++){
                    newArr[i][k] = arr[i][k];
                }
            }

            //Конец преобразования
            System.out.println("Массив после преобразования:");
            for(int i = 0; i < str - 1; i++){
                for(int k = 0; k < sto - 1; k++){
                    System.out.print(newArr[i][k] + " ");
                }
                System.out.println("");
            }
            System.out.println("Удалена " + delStr + " строка и " + delSto + " столбец");

        }
    }
}

//        6. Напишите программу, в которой создается и инициализируется
//        двумерный числовой массив. Затем из этого массива удаляется строка и
//        столбец (создается новый массив, в котором по сравнению с исходным
//        удалена одна строка и один столбец). Индекс удаляемой строки и индекс
//        удаляемого столбца определяется с помощью генератора случайных чисел.