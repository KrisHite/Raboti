package Laba3;
import java.util.Scanner;
public class Example24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 числа: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int minNum;
        int minArr;
        if(num1 < num2){
            minNum = num2 - num1;
            minArr = num1;
        } else {
            minNum = num1 - num2;
            minArr = num2;
        }
        int [] arr = new int[minNum + 1];
        for(int i = 0; i < arr.length; i++){
            arr[i] = minArr + i;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
//        4. Напишите программу, в которой пользователем вводится два
//        целых числа. Программа выводит все целые числа — начиная с наименьшего
//        (из двух введенных чисел) и заканчивая наибольшим (из двух введенных
//        чисел). Предложите разные версии программы (с использованием разных
//        операторов цикла).