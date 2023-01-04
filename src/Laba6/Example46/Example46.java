package Laba6.Example46;
import java.util.Scanner;
import java.util.Arrays;
public class Example46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyClass objOne = new MyClass();
        MyClass objTwo = new MyClass();
        System.out.println("Введите строку символов: ");
        String textIn = in.nextLine();
        char[] symInArr = textIn.toCharArray();
        char symIn = symInArr[0];
        System.out.println("Строка: " + textIn);
        System.out.println("Первый символ строки: " + symIn);
        System.out.println("Массив из символов строки: " + Arrays.toString(symInArr));

        objOne.textOrSym(textIn);//Вызов метода с аргументом String в первом объекте
        objOne.textOrSym(symIn);//Вызов метода с аргументом Char в первом объекте

        System.out.println("1) Текстовое поле класса: " + objOne.text);
        System.out.println("Символьное поле класса: " + objOne.sym);
        objTwo.textOrSym(symInArr);//Вызов метода с аргументом Char[] во втором объекте
        System.out.println("2) Текстовое поле класса: " + objTwo.text);
        System.out.println("Символьное поле класса: " + objTwo.sym);

    }
}
//        1. Напишите программу с классом, в котором есть два поля: символьное и текстовое.
//        В классе должен быть перегруженный метод для присваивания значений полям. Если метод
//        вызывается с символьным аргументом, то соответствующее значение присваивается
//        символьному полю. Если метод вызывается с текстовым аргументом, то он определяет
//        значение текстового поля. Методу аргументом также может передаваться символьный
//        массив. Если массив состоит из одного элемента, то он определяет значение символьного
//        поля. В противном случае (если в массиве больше одного элемента) из символов массива
//        формируется текстовая строка и присваивается значением текстовому полю