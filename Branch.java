package documentassembler;

import java.util.ArrayList;

public class Branch implements Node {
    
    ArrayList<Node> subNodes = new ArrayList<>();
    
    public String getText() {
        
        String nodeString = "";

        for(Node node : this.subNodes) {
            
            nodeString += node.getText() + " ";
        }

        return nodeString;
    }

    public void addNode(Node child) {
       
        subNodes.add(child);
    }

    public void removeNode(Node child) {

        subNodes.remove(child);
    }
}
