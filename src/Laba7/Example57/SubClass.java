package Laba7.Example57;

public class SubClass extends SuperClass {
    public int number;

    SubClass(String text){
        super(text);
    }

    SubClass(int num, String text){
        super(text);
        this.number = num;
    }

    @Override
    public String GetText(){
        return super.GetText();
    }
    public void SetText(String text){
        super.SetText(text);
    }
    public void SetText(String text, int num){
        this.number = num;
        super.SetText(text);
    }
    public int GetNumber(){
        return this.number;
    }
    @Override
    public int GetTextLength(){
        this.number = super.GetTextLength();
        return this.number;
    }
}
