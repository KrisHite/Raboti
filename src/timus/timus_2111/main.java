package timus.timus_2111;

import java.util.Arrays;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();//Костыль. Так работает Scanner
        String  dStr= in.nextLine();
        String[] dArr = dStr.split("\\D+");
        long[] road = new long[n];
        for(int i = 0; i < road.length; i++){
            road[i] = Integer.parseInt(dArr[i]);
        }
        Arrays.sort(road);
        long mass = 0;
        long price = 0;
        for(int i = 0; i < road.length; i++){
            mass += road[i];
        }
        for(int i = 0; i < road.length; i++){
            price += mass * road[i];
            mass -= road[i];
            price += mass * road[i];
        }
        System.out.println(price);
    }
}
