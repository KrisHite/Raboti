package Laba5.Example44;
import java.util.Scanner;
public class Example44 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Class myClass = new Class();
        System.out.println(myClass.ReturnInt());
        System.out.println("Введите число:");
        int intNum = in.nextInt();
        myClass.IntClass(intNum);
        System.out.println(myClass.ReturnInt());
        Class mySecondClass = new Class();
        System.out.println(mySecondClass.ReturnInt());
    }

}

//        5. Напишите программу с классом, у которого есть закрытое целочисленное
//        поле. Значение полю присваивается с помощью открытого метода. Методу
//        аргументом может передаваться целое число, а также метод может вызываться
//        без аргументов. Если методы вызывается без аргументов, то поле получает
//        нулевое значение. Если метод вызывается с целочисленным аргументом, то
//        это значение присваивается полю. Однако если переданное аргументом
//        методу значение превышает 100, то значением полю присваивается число 100.
//        Предусмотрите в классе конструктор, который работает по тому же принципу
//        что и метод для присваивания значения полю. Также в классе должен быть
//        метод, позволяющий проверить значение поля.
