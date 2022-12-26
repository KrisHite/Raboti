package Laba5.Example42;

public class Example42 {
    public static void main(String[] args) {
        Cubes cube1 = new Cubes();
        System.out.println("Длинна: " + cube1.length + " ширина: " + cube1.width);
        Cubes cube2 = new Cubes(100);
        System.out.println("Длинна: " + cube2.length + " ширина: " + cube2.width);
        Cubes cube3 = new Cubes(100, 200);
        System.out.println("Длинна: " + cube3.length + " ширина: " + cube3.width);
    }
}
//        3. Напишите программу с классом, у которого есть два целочисленных поля.
//        В классе должны быть описаны конструкторы, позволяющие создавать
//        объекты без передачи аргументов, с
//        передачей одного аргумента и с передачей
//        двух аргументов.