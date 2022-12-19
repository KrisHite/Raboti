package Laba4;

public class Example32 {
    public static void main(String[] args) {
        int h = 11;//Катеты треугольника

        for(int i = 0; i < h; i++){
            for(int j = 0; j < i + 1 ; j++){
                System.out.print("+");
            }
            System.out.println("");
        }

    }
}
//        2. Напишите программу, которая выводит в консольное окно
//        прямоугольный треугольник;