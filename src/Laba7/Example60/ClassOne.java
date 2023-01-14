package Laba7.Example60;

public class ClassOne {
    protected String text;
    ClassOne(){

}
    ClassOne(String text){
        this.text = text;
    }

    public String GetInformation(){
        String info = "class: " + getClass().getSimpleName() +
                "\n"+ "text = " + this.text;
        System.out.println(info);
        return info;
    }
}
