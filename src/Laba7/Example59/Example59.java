package Laba7.Example59;

public class Example59 {
    public static void main(String[] args) {
        ClassOne oneObject = new ClassOne('s');
        System.out.println(oneObject.toString());
        ClassTwo twoObject = new ClassTwo('g', "Это текст");
        System.out.println(twoObject.toString());
        ClassThree threeObject = new ClassThree('a', "This is text too", 133);
        System.out.println(threeObject.toString());
        System.out.println("Далее выводятся значение полей скопированных объектов");
        ClassOne oneObject1 = oneObject.copyClassOne();
        System.out.println(oneObject1.toString());
        ClassTwo twoObject1 = twoObject.copyClassTwo();
        System.out.println(twoObject1.toString());
        ClassTwo threeObject1 = threeObject.copyClassThree();
        System.out.println(threeObject1.toString());
    }
}
//        4. Напишите программу, в которой использована цепочка наследования из трех
//        классов. В первом классе есть открытое символьное поле. Во втором классе появляется
//        открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
//        каждом из классов должен быть конструктор, позволяющий создавать объект на основе
//        значений полей, переданных аргументами конструктору, а также конструктор создания
//        копии