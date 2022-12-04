package timus_1820;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nK = in.nextLine();

        String[] splitNK = nK.split("\\D+");
        int[] arr = new int[splitNK.length];

        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(splitNK[i]);
        }
        double result;

        if(arr[0] < arr[1]){
            result = 2;
        }
        else {
            result = Math.ceil((arr[0] * 1.0/arr[1]) * 2);
        }

        System.out.println((int) result);
        in.close();
    }
}

