package com.viniciussntn;

import com.viniciussntn.nodes.*;
import com.viniciussntn.traversal.*;

import java.io.FileWriter;
import java.io.IOException;

public class DocumentAssembler {

    Branch root;
    Traversal metodoDePercorrimento;

    public DocumentAssembler(Branch root, Traversal metodoDePercorrimento) {
        this.root = root;
        this.metodoDePercorrimento = metodoDePercorrimento;
    }

    public static void main(String[] args) {

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

        DocumentAssembler looplex = new DocumentAssembler(root, new inOrder());
        looplex.txtAssemble();


    }

    public void consoleAssemble() {

        metodoDePercorrimento.assemble(this.root);
        System.out.println(metodoDePercorrimento.getText());
    }

    public void txtAssemble() {

        metodoDePercorrimento.assemble(this.root);
        FileWriter output = null;

        try {
            output = new FileWriter("document.txt");
            output.write("2317 O texto contido no nó inserido é: " + metodoDePercorrimento.getText());
            output.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
