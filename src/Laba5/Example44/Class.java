package Laba5.Example44;

public class Class {
    private int intField;

    public Class(){
        this.intField = 0;
    }
    public Class(int intField){
        if(intField > 100){
            this.intField = 100;
        }else{
            this.intField = intField;
        }
    }

    public void IntClass(){
        this.intField = 0;
    }

    public void IntClass(int intField){
        if(intField > 100){
            this.intField = 100;
        }else{
            this.intField = intField;
        }
    }

    public int ReturnInt(){
        return intField;
    }
}
