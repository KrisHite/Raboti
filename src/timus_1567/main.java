package timus_1567;

import java.util.Scanner;
//Доделать!
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String[] TEXT = text.split("");
        char[] symbols = new char[TEXT.length];

//        for (int i = 0; i < TEXT.length; i++){
//            symbols[i] = TEXT[i];
//        }

        char[] but1 = new char[]{'a', 'd', 'g', 'j', 'm', 'p', 's', 'v', 'y', '.', ' '};
        char[] but2 = new char[]{'b', 'e', 'h', 'k', 'n', 'q', 't', 'w', 'z', ','};
        char[] but3 = new char[]{'c', 'f', 'i', 'l', 'o', 'r', 'u', 'x', '!'};
        int price = 0;

        for(int i = 0; i < TEXT.length; i++){


        }
        System.out.println(price);

    }
}
