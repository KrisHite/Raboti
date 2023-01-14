package Laba7.Example59;

public class ClassThree extends ClassTwo {
    public int number;

    ClassThree(String text){
        super(text);
    }
    ClassThree(int number){
        this.number = number;
    }
    ClassThree(int number, String text){
        super(text);
        this.number = number;
    }
    ClassThree(char symbol, String text, int number){
        super(text);
        this.symbol = symbol;
        this.number = number;
    }
    public ClassThree copyClassThree(){
        ClassThree copyClassThree = new ClassThree(this.number);
        copyClassThree.symbol = this.symbol;
        copyClassThree.text = this.text;
        return copyClassThree;
    }

    public void SetInt(char symbol) {
        this.symbol = symbol;
    }
    public int GetInt() {
        return this.number;
    }
    @Override
    public String toString(){
        String info = "ClassThree\n" +
                "Class: " + getClass().getSimpleName() + "\n" +
                " symbol = " + this.symbol + "\n" +
                " text = " + this.text + "\n" +
                " number = " + this.number;
        return info;
    }

}
