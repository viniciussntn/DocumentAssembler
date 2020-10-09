package com.viniciussntn;

import com.viniciussntn.nodes.*;
import com.viniciussntn.traversal.*;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class DocumentAssembler {

    private Branch root;
    private Traversal traversalMethod;
    private String outputFileName;

    /**
     * @param root indica o nó raiz para o document assembler
     * @param chosenTraversalMethod indica o método de percorrimento
     * @param outputFileName indica o nome do arquivo de saída
     */
    public DocumentAssembler(Branch root, Traversal chosenTraversalMethod, String outputFileName) {
        this.root = root;
        this.traversalMethod = chosenTraversalMethod;
        this.outputFileName = outputFileName;
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

        DocumentAssembler looplex = new DocumentAssembler(root, new inOrderTraversalWithLog(), "document.txt");
        looplex.txtAssemble();


    }

    public void consoleAssemble() {

        traversalMethod.assemble(this.root);
        System.out.println(traversalMethod.getText());
    }

    public void txtAssemble() {

        traversalMethod.assemble(this.root);
        FileWriter output = null;

        try {

            FileOutputStream eraseDocumentContent = new FileOutputStream( this.getOutputFileName() );

            output = new FileWriter( this.getOutputFileName(), true );
            output.write( this.traversalMethod.getText() );
            output.write("\nLog: " + java.time.LocalDate.now() + " " + java.time.LocalTime.now());
            output.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String getOutputFileName() {
        return outputFileName;
    }

    public void setOutputFileName(String outputFileName) {
        this.outputFileName = outputFileName;
    }
}
