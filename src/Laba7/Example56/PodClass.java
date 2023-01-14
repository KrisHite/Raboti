package Laba7.Example56;

public class PodClass extends SuperClass {

    private String text2, text3;

    PodClass(String text1, String text2){
        this.text2 = text1;
        this.text3 = text2;
    }

    PodClass(String text){
        super(text);
    }

    public String GetText1(){
        return text2;
    }
    public void SetText1(String text) {
        this.text2 = text;
    }

    public String GetText2(){
        return text3;
    }
    public void SetText2(String text) {
        this.text3 = text;
    }

        @Override
    public String toString(){
        String nameClass = "Pod" + "\n" +
                "Class: " + getClass().getSimpleName() + "\n" +
                " text1 = " + GetText() + "\n" +
                " text2 = " + this.text2 + "\n" +
                " text3 = " + this.text3;
        return nameClass;
    }

}
