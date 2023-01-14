package Laba7.Example58;

public class SecondSuperClass extends ThirstSuperClass {
public char symbol;
    SecondSuperClass(){

    }
    SecondSuperClass(int number){
        super(number);
    }
    SecondSuperClass(int number, char symbol){
        super(number);
        this.symbol = symbol;
    }

    @Override
    public void SetInformation(int number){
       super.number = number;
    }

    public void SetInformation(int number, char symbol){
        this.number = number;
        this.symbol = symbol;
    }

    @Override
    public String toString(){
        String info = "SecondClass\n" +
                "Class: " + getClass().getSimpleName() + "\n" +
                "number = " + this.number + "\n" +
                "symbol = " + this.symbol;
        return info;
    }
}
