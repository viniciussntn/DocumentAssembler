package documentassembler;

import java.io.IOException;
import java.io.FileWriter;

class documentAssembler {
    Branch root;

    public documentAssembler (Branch root) {
        this.root = root;
    }

    public void consoleAssemble() { 
        System.out.println(this.root.getText());
    }

    public void txtAssemble() {
        
        FileWriter output = null;

		try {
            output = new FileWriter("document.txt");
            output.write("O texto contido no nó inserido é: " + this.root.getText());       
            output.close();

		} catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        
        Branch root = new Branch();
        Branch branch1 = new Branch();
        Branch branch2 = new Branch();

        
        root.addNode(new Leaf("Se eu"));
        root.addNode(branch1);
        
        branch1.addNode(new Leaf("fosse voces"));
        branch1.addNode(new Leaf("eu"));
        branch1.addNode(branch2);
        
        branch2.addNode(new Leaf("me"));
        branch2.addNode(new Leaf("contrataria!"));
        
        documentAssembler looplex = new documentAssembler(root);
        looplex.txtAssemble();
    }
}
