package Laba7.Example60;

public class SubClassTwo extends ClassOne{
    protected char symbol;

    SubClassTwo(String text) {
        super(text);
    }

    SubClassTwo(String text, char symbol){
        super(text);
        this.symbol = symbol;
    }
    @Override
    public String GetInformation(){
        String info = "class: " + getClass().getSimpleName() +
                "\n"+ "text = " + this.text + "\n" +
                "symbol = " + this.symbol;
        System.out.println(info);
        return info;
    }
}
