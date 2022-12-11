package Laba3;

import java.util.Scanner;

public class Example22_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название дня недели: ");
        String day = in.nextLine();
        int numOfDay = 0;

        if(day.equals("понедельник") || day.equals("Понедельник")){
            numOfDay = 1;
        }
        if(day.equals("вторник") || day.equals("Вторник")){
            numOfDay = 2;
        }
        if(day.equals("среда") || day.equals("Среда")){
            numOfDay = 3;
        }
        if(day.equals("четверг") || day.equals("Четверг")){
            numOfDay = 4;
        }
        if(day.equals("пятница") || day.equals("Пятница")){
            numOfDay = 5;
        }
        if(day.equals("суббота") || day.equals("Суббота")){
            numOfDay = 6;
        }
        if(day.equals("воскресение") || day.equals("Воскресение")){
            numOfDay = 7;
        }


        if(numOfDay != 0) {
            System.out.println("Это " + numOfDay + " по счету день недели");
        }
        else {
            System.out.println("Нет накого дня недели!");
        }
    }

}

//        2. Напишите программу, в которой пользователю предлагается
//        ввести название дня недели. По введенному названию программа определяет
//        порядковый номер дня в неделе. Если пользователь вводит неправильное
//        название дня, программа выводит сообщение о том, что такого дня нет.
//        Предложите версию программы на основе вложенных условных операторов и
//        на основе оператора выбора switch.
