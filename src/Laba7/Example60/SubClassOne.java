package Laba7.Example60;

public class SubClassOne extends ClassOne{
    protected int number;
    SubClassOne(String text) {
        super(text);
    }
    SubClassOne(String text, int num){
        super(text);
        this.number = num;
    }
    @Override
    public String GetInformation(){
        String info = "class: " + getClass().getSimpleName() +
                "\n"+ "text = " + this.text + "\n" +
                "number = " + this.number;
        System.out.println(info);
        return info;

    }
}
