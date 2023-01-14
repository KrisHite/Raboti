package Laba7.Example59;

public class ClassTwo extends ClassOne{
    public String text;

    ClassTwo(){
    }
    ClassTwo(char symbol){
        super(symbol);
    }
    ClassTwo(String text){
        this.text = text;
    }
    ClassTwo(char symbol, String text){
        super(symbol);
        this.text = text;
    }
    public ClassTwo copyClassTwo(){
        ClassTwo copyClassTwo = new ClassTwo(this.text);
        copyClassTwo.symbol = this.symbol;
        return copyClassTwo;
    }
    public void SetString(String text) {
        this.text = text;
    }
    public String GetString() {
        return this.text;
    }
    @Override
    public String toString(){
        String info = "ClassTwo\n" +
                "Class: " + getClass().getSimpleName() + "\n" +
                " symbol = " + this.symbol + "\n" +
                " text = " + this.text;
        return info;
    }
}
