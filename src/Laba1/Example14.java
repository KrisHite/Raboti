package Laba1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number:");
        int num = in.nextInt();
        int num1 = num - 1;
        int num2 = num + 1;
        int num3 = (num + num1 + num2) * (num + num1 + num2);
        System.out.print(num1 + " ");
        System.out.print(num + " ");
        System.out.print(num2 + " ");
        System.out.println(num3 + " ");
        in.close();
    }
}
