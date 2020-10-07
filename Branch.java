package documentassembler;

import java.util.ArrayList;

public class Branch extends Node {
    
    ArrayList<Node> subNodes = new ArrayList<>();
    
    public String getText() {
        
        String nodeString = "";

        for(Node node : this.subNodes) {
            
            nodeString += node.getText() + " ";
        }

        return nodeString;
    }

    public void addNode(Node child) {
        
        child.setNivel( this.getNivel() + 1 );
        subNodes.add(child);
    }

    public void removeNode(Node child) {

        subNodes.remove(child);
    }

    public int getGrau() {
        int grau = 0;

        for(Node subNo : subNodes ) {
            
            grau++;
            grau += subNo.getGrau();
        } 

        return grau;
    }

    // n tá pronto
    public int getAltura() {
   
        int altura = this.getNivel();

        for (Node node : subNodes) {
            
            if(node.getNivel() > altura ) {
                altura = node.getNivel();
            } 

            if(node instanceof Branch) {
                node.getAltura();
            }
        }
        return altura;
    }
}
