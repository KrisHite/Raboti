package Laba7.Example56;

public class SuperClass {
    private String text1;

    SuperClass(String text){
        this.text1 = text;
    }
    SuperClass(){
    }
    public String GetText(){
        return text1;
    }
    public void SetText(String text){
        this.text1 = text;
    }

    @Override
    public String toString(){
        String nameClass = "Super" + "\n" +
                "Class: " + getClass().getSimpleName() + "\n" +
                "text1 = " + GetText();
        return nameClass;
    }

}
