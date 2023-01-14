package Laba7.Example58;

public class Example58 {
    public static void main(String[] args) {
        ThirstSuperClass thirstClassObject = new ThirstSuperClass();
        thirstClassObject.SetInformation(15);
        System.out.println(thirstClassObject.toString());
        SecondSuperClass secondClassObject = new SecondSuperClass();
        secondClassObject.SetInformation(150, 'a');
        System.out.println(secondClassObject.toString());
        SubClass subObject = new SubClass();
        subObject.SetInformation(220, 'd', "Это строка в третьем классе");
        System.out.println(subObject.toString());


    }
}

//        3. Напишите программу, в которой на основе суперкласса создается подкласс, а на
//        основе этого подкласса создается еще один подкласс (цепочка наследования из трех
//        классов). В первом суперклассе есть открытое целочисленное поле, метод с одним
//        параметром для присваивания значения полю и конструктор с одним параметром. Во
//        втором классе появляется открытое символьное поле, метод с двумя параметрами для
//        присваивания значения полям (перегрузка метода из суперкласса) и конструктор с двумя
//        параметрами. В третьем классе появляется открытое текстовое ноле, метод с тремя
//        аргументами для присваивания значений полям (перегрузка метода из суперкласса) и
//        конструктор с тремя параметрами. Для каждого класса определите метод toString () так,
//        чтобы он возвращал строку с названием класса и значениями всех полей объекта.
