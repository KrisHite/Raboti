package Laba7.Example58;

public class ThirstSuperClass {
    public int number;

    ThirstSuperClass(){
    }
    ThirstSuperClass(int number){
        this.number = number;
    }
    public void SetInformation(int number){
        this.number = number;
    }

    @Override
    public String toString(){
        String info = "ThirstClass\n" +
        "Class: " + getClass().getSimpleName() + "\n" +
        "number = " + this.number;
        return info;
    }

}
