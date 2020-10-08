package looplex;

import java.io.IOException;
import java.io.FileWriter;

class documentAssembler {
    Branch root;
    Percorrimento metodoDePercorrimento;

    public documentAssembler (Branch root, Percorrimento metodoDePercorrimento) {
        this.root = root;
        this.metodoDePercorrimento = metodoDePercorrimento;
    }

    public void consoleAssemble() { 

        metodoDePercorrimento.assemble(this.root);
        System.out.println(metodoDePercorrimento.getTxtString());
    }

    public void txtAssemble() {
        
        metodoDePercorrimento.assemble(this.root);
        FileWriter output = null;

		try {
            output = new FileWriter("document.txt");
            output.write("1248 O texto contido no nó inserido é: " + metodoDePercorrimento.getTxtString());       
            output.close();

		} catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        
        Branch root = new Branch();
        Branch branch1 = new Branch();
        Branch branch2 = new Branch();

        
        root.addNode(new Leaf("Texto"));
        root.addNode(branch1);
        
        branch1.addNode(new Leaf("de exemplo"));
        branch1.addNode(new Leaf("para"));
        branch1.addNode(branch2);
        
        branch2.addNode(new Leaf("assemble"));
        branch2.addNode(new Leaf("do documento."));
        
        documentAssembler looplex = new documentAssembler(root, new emOrdem());
        looplex.txtAssemble();

        

    }
}
