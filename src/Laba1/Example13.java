package Laba1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number:");
        int firstNum = in.nextInt();
        System.out.println("Input second number:");
        int secNum = in.nextInt();
        int sum = firstNum + secNum;
        System.out.println(sum);
        in.close();
    }
}
