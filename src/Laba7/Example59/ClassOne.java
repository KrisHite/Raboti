package Laba7.Example59;

public class ClassOne {
    public char symbol;
    ClassOne(){
    }
    ClassOne(char symbol){
        this.symbol = symbol;
    }
    public ClassOne copyClassOne(){
        ClassOne copyClassOne = new ClassOne();
        copyClassOne.symbol = this.symbol;
        return copyClassOne;
    }
    public void SetSym(char symbol) {
        this.symbol = symbol;
    }
    public char GetSym() {
        return this.symbol;
    }
    @Override
    public String toString(){
        String info = "ClassOne\n" +
                " Class: " + getClass().getSimpleName() + "\n" +
                " symbol = " + this.symbol;
        return info;
    }
}
