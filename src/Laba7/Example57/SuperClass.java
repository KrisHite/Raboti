package Laba7.Example57;

public class SuperClass {
    private String text;

    SuperClass(String text){
        this.text = text;
    }

    public void SetText(){
        this.text = "Нет параметров";
    }
    public void SetText(String text){
        this.text = text;
    }

    public int GetTextLength(){
        if(null == this.text){
            return 0;
        }
        return this.text.length();
    }
    public String GetText(){
        return this.text;
    }
}
