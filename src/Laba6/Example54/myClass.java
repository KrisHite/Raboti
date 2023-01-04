package Laba6.Example54;

public class myClass {
    public static char[] CharArr(char[] arr){
        char sym;
        for (int i = arr.length - 1, j = 0; i >= arr.length/2 ; i--, j++) {
            sym = arr[j];
            arr[j] = arr[i];
            arr[i] = sym;
        }
        return arr;
    }
}
