package looplex;

import java.util.ArrayList;

public interface Percorrimento {

    public void assemble(Node root);
}

class emOrdem implements Percorrimento {
    
    public void assemble(Node root) {

        if(root instanceof Leaf) {
           
            System.out.println(root.getText());

        } else if (root instanceof Branch ) {
    
            for (Node subNode : root.getSubNos() ) {
                
                assemble(subNode);
            }
        }
        
    }
}

class posOrdem implements Percorrimento {
    
    public void assemble(Node root) {
        //wip
    }
}