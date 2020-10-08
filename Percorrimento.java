package looplex;

import java.util.ArrayList;

public abstract class Percorrimento {
    
    public String txtString = "";

    public abstract void assemble(Node root);
    public abstract String getTxtString();
}

class emOrdem extends Percorrimento {

    
    public void assemble(Node root) {

        if(root instanceof Leaf) {
           
            this.txtString += root.getText() + " ";

        } else if (root instanceof Branch ) {
    
            for (Node subNode : root.getSubNos() ) {
                
                assemble(subNode);
            }
        }
    }


    public String getTxtString() {
        
        return this.txtString;
    }
}