package Laba5.Example43;
import java.util.Scanner;
public class Example43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int num = in.nextInt();
        System.out.println("Введите символ: ");
        char symChar = in.next().charAt(0);
        Class c = new Class(num,symChar);
        System.out.println(c.intField);
        System.out.println(c.charField);
        System.out.println("Введите число типа double: ");
        double doubleNumber = in.nextDouble();
        Class l = new Class(doubleNumber);
        System.out.println(l.intField);
        System.out.println(l.charField);

    }
}
// 4. Напишите программу с классом, у которого есть символьное и
// целочисленное поле. В классе должны быть описаны версии конструктора с
// двумя аргументами (целое число и символ – определяют значения полей), а
// также с одним аргументом типа double. В последнем случае действительная
// часть аргумента определяет код символа (значение символьного поля), а
// дробная часть (с учетом десятых и сотых) определяет значение
// целочисленного поля. Например, если аргументом передается число 65.1267,
// то значением символьного поля будет символ ‘A’ с годом 65, а целочисленное
// поле получит значение 12 (в дробной части учитываются только десятые и
// сотые).