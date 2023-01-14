package Laba7.Example56;

public class Example56 {
    public static void main(String[] args) {
        SuperClass superObject = new SuperClass("В конструктор суперкласса");
        System.out.println(superObject.toString());
        PodClass podObject1 = new PodClass("В конструктор подкласса с одним аргументом");
        System.out.println(podObject1.toString());
        PodClass podObject2 = new PodClass("В конструктор подкласса", "где два аргумента");
        System.out.println(podObject2.toString());
    }
}
//        1. Напишите программу, в которой есть суперкласс с приватным текстовым полем,
//        конструктором с текстовым параметром и где переопределен метод toString (). На основе
//        суперкласса путем наследования создается подкласс. У него появляется еще одно
//        приватное текстовое поле. Также подкласс должен иметь версии конструктора с одним и
//        двумя текстовыми аргументами, а еще в нем должен быть переопределен метод toString ().
//        В обоих классах метод toString () переопределяется так, что он возвращает строку с
//        названием класса и значение текстового поля или текстовых полей.