package Laba5.Example45;
import java.util.Scanner;
public class Example45 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int numOne = in.nextInt();
        System.out.println("Введите второе число: ");
        int numTwo = in.nextInt();
        Class myClass = new Class(numOne, numTwo);
        myClass.returnNum();
        System.out.println("Введите следующее число: ");
        int nextInt = in.nextInt();
        myClass.Numbers(nextInt);
        myClass.returnNum();

    }
}
//    6. Напишите программу с классом, в котором есть два закрытых
//    целочисленных поля (назовем их max и min). Значение поля max не может
//    быть меньше значения поля min. Значения полям присваиваются с помощью
//    открытого метода. Метод может вызываться с одним или двумя
//    целочисленными аргументами. При вызове метода значения полям
//    присваиваются так: сравниваются текущие значения полей и значения
//    аргументов, переданных методу. Самое большое из значений присваивается
//    полю max, а самое маленькое из значений присваивается полю min.
//    Предусмотрите конструктор, который работает по тому же принципу, что и
//    метод для присваивания значений полям. В классе также должен быть метод,
//    отображающий в консольном окне значения полей объекта.