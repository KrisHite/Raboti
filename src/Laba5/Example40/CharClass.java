package Laba5.Example40;

public class CharClass {
    private char symbol;//Закрытое символьное поле

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
    public int getCode() {
        return symbol;
    }
    public void displayCharAndSym(){
        System.out.println("Символ = " + symbol + ", его код = " + getCode());
    }

}
//        1. Напишите программу с классом, в котором есть закрытое символьное поле
//        и три открытых метода. Один из методов позволяет присвоить значение полю.
//        Еще один метод при вызове возвращает результатом код символа. Третий
//        метод позволяет вывести в консольное окно символ (значение поля) и его код.