package documentassembler;

import java.util.ArrayList;

public class Branch implements Node {
    
    ArrayList<Node> subNodes = new ArrayList<>();
    
    public void printText() {
        
        for(Node node : this.subNodes) {
            node.printText();
        }
    }

    public void addNode(Node child) {
       
        subNodes.add(child);
    }

    public void removeNode(Node child) {

        subNodes.remove(child);
    }
}
