package Laba7.Example58;

public class SubClass extends SecondSuperClass{
    public String text;
    SubClass(){
    }
    SubClass(char symbol){
        super(symbol);
    }

    SubClass(int number, char symbol, String text){
        this.number = number;
        this.symbol = symbol;
        this.text = text;
    }
    @Override
    public void SetInformation(int number, char symbol){
        this.number = number;
        this.symbol = symbol;
    }

    public void SetInformation(int number, char symbol, String text){
        this.number = number;
        this.symbol = symbol;
        this.text = text;
    }

    @Override
    public String toString(){
        String info = "ThirdClass\n" +
                "Class: " + getClass().getSimpleName() + "\n" +
                "number = " + this.number + "\n" +
                "symbol = " + this.symbol + "\n" +
                "text = " + this.text;
        return info;
    }

}
