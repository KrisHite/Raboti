package Laba6.Example49;

public class myClass {

    public static int Factorial(int number){
        int factorial = number;
        do{
            number -= 2;
            factorial *= number;
        }while(number > 2);
        return factorial;
    }
}
