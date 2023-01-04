package Laba6.Example46;

import java.util.Arrays;

public class MyClass {
    public char sym;
    public String text;

    public void textOrSym(char sym){
        this.sym = sym;
    }

    public void textOrSym(String text){
        this.text = text;
    }

    public void textOrSym(char[] text){
        if(text.length > 1){
            this.text = String.valueOf(text);

        }else {
            this.sym = text[0];

        }
    }
}
