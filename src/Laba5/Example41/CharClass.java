package Laba5.Example41;

public class CharClass {
    private char sym1 = 'a';//первый символ
    private char sym2 = 'k';//второй символ
    public void lineOfChar(){
        if(sym1 > sym2){
            char[] arr = new char[sym1 - sym2 + 1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sym2;
                sym2++;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }else {
            char[] arr = new char[sym2 - sym1 + 1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sym1;
                sym1++;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
