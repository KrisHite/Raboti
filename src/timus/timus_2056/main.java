package timus.timus_2056;

import java.util.Scanner;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int exams = in.nextInt();
        int[] num = new int[exams];
        float summ = 0;
        for(int i =0; i < num.length; i++){
            num[i] = in.nextInt();
        }
        Arrays.sort(num);
        if (num[0] == 3){
            System.out.println("None");
        }else{
            if(num[0] == 5){
                System.out.println("Named");
            }else{
                for(int i = 0; i < num.length; i ++){
                    summ += num[i];
                }
                summ = summ/num.length;
                if(summ >= 4.5){
                    System.out.println("High");
                }else {
                    System.out.println("Common");
                }
            }
        }
    }
}
