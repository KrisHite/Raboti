package Laba5.Example43;

public class Class {
    public char charField;
    public int intField;

    public Class(int intField, char charField){
        this.intField = intField;
        this.charField = charField;
    }
    public Class(double doubleArgs){
        this.charField = (char)doubleArgs;
        doubleArgs = (doubleArgs - (int)doubleArgs) * 100;
        this.intField = (int)doubleArgs;


    }
}
