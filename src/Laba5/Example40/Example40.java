package Laba5.Example40;
import java.util.Scanner;
public class Example40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CharClass sym = new CharClass();
        System.out.println("Введите символ для: ");
        char symChar = in.next().charAt(0);
        sym.setSymbol(symChar);
        sym.displayCharAndSym();
    }
}
//        1. Напишите программу с классом, в котором есть закрытое символьное поле
//        и три открытых метода. Один из методов позволяет присвоить значение полю.
//        Еще один метод при вызове возвращает результатом код символа. Третий
//        метод позволяет вывести в консольное окно символ (значение поля) и его код.