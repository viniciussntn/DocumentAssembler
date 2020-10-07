package documentassembler;

public class Leaf extends Node {
    
    String text;

    public Leaf (String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public int getGrau() {
        return 0;
    }






}
