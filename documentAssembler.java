package documentassembler;

class documentAssembler {
    Branch root;

    public documentAssembler (Branch root) {
        this.root = root;
    }

    public void assemble() { 
        this.root.printText();
    }

    public static void main(String args[]) {
        
        Branch root = new Branch();
        Branch branch1 = new Branch();
        Branch branch2 = new Branch();

        documentAssembler looplex = new documentAssembler(root);

        root.addNode(new Leaf("um"));
        root.addNode(branch1);

        branch1.addNode(new Leaf("dois"));
        branch1.addNode(new Leaf("tres"));
        branch1.addNode(branch2);

        branch2.addNode(new Leaf("quatro"));
        branch2.addNode(new Leaf("cinco"));

        looplex.assemble();
    }
}
