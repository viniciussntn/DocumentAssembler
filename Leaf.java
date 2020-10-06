package documentassembler;

public class Leaf implements Node {
    
    String text;

    public Leaf (String text) {
        this.text = text;
    }

    public void printText() {
        System.out.println(this.text);
    }

    public void setText (String text) {
        this.text = text;
    }
}
