package Laba4;
import java.util.Scanner;
public class Example37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int str = in.nextInt();
        System.out.println("Введите количество столбцов: ");
        int sto = in.nextInt();
        int n = 1;//Число, записываемое в массив.
        if(str <= 0 || sto <= 0){
            System.out.println("Некорректное значение!");
        }else{
            Integer[][] arr = new Integer[str][sto];//Создал массив
            for(int i = 0; i < str; i++){
                if(i % 2 == 0 || i == 0){
                    for(int k = 0; k < sto; k++){
                        arr[i][k] = n;
                        n++;
                    }
                }else{
                    for(int k = sto - 1; k >= 0; k--){
                        arr[i][k] = n;
                        n++;
                    }
                }
            }
            for(int i = 0; i < str; i++){
                for(int k = 0; k < sto; k++){
                    System.out.print(arr[i][k] + " ");
                }
                System.out.println("");
            }
        }
    }
}

//        7. Напишите программу, в которой создается двумерный числовой массив
//        и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
//        затем последний столбец (снизу вверх), вторая строка (слева направо) и так
//        далее.()
