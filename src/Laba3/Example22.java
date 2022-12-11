package Laba3;

import java.util.Scanner;

public class Example22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название дня недели: ");
        String day = in.nextLine();
        int numOfDay = 0;
        switch (day){
            case("понедельник"):
                numOfDay = 1;
                break;
            case("вторник"):
                numOfDay = 2;
                break;
            case("среда"):
                numOfDay = 3;
                break;
            case("четверг"):
                numOfDay = 4;
                break;
            case("пятница"):
                numOfDay = 5;
                break;
            case("суббота"):
                numOfDay = 6;
                break;
            case("воскресение"):
                numOfDay = 7;
                break;
            case("Понедельник"):
                numOfDay = 1;
                break;
            case("Вторник"):
                numOfDay = 2;
                break;
            case("Среда"):
                numOfDay = 3;
                break;
            case("Четверг"):
                numOfDay = 4;
                break;
            case("Пятница"):
                numOfDay = 5;
                break;
            case("Суббота"):
                numOfDay = 6;
                break;
            case("Воскресение"):
                numOfDay = 7;
                break;
            default:
                System.out.println("Такого дня не существует!");
        }
        if(numOfDay != 0) {
            System.out.println("Это " + numOfDay + " по счету день недели");
        }
    }

}

//        2. Напишите программу, в которой пользователю предлагается
//        ввести название дня недели. По введенному названию программа определяет
//        порядковый номер дня в неделе. Если пользователь вводит неправильное
//        название дня, программа выводит сообщение о том, что такого дня нет.
//        Предложите версию программы на основе вложенных условных операторов и
//        на основе оператора выбора switch.
