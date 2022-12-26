package Laba5.Example45;

public class Class {
    private int min;
    private int max;
    public Class(int numOne, int numTwo){
        if(numOne < numTwo){
            this.min = numOne;
            this.max = numTwo;
        }else {
            this.max = numOne;
            this.min = numTwo;
        }
    }
    public void Numbers(int Num){
        if (Num < max){
            this.min = Num;
        }else {
            this.max = Num;
        }
    }
    public void Numbers(int numOne, int numTwo){
        if(numOne < numTwo){
            this.min = numOne;
            this.max = numTwo;
        }else {
            this.max = numOne;
            this.min = numTwo;
        }
    }
    public void returnNum(){
        System.out.println("Min: " + min + " Max: " + max);
    }
}
