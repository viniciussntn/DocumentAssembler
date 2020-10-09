package looplex;

import java.util.ArrayList;

public abstract class Percorrimento {
    
    public String text = "";

    public abstract void assemble(Node root);
    public abstract String getText();
}

class emOrdem extends Percorrimento {
    
    public void assemble(Node root) {

        if(root instanceof Leaf) {
           
            this.text += root.getText() + " ";

        } else if (root instanceof Branch ) {
    
            for (Node subNode : root.getSubNos() ) {
                
                assemble(subNode);
            }
        }
    }

    public String getText() {
        
        return this.text;
    }
}