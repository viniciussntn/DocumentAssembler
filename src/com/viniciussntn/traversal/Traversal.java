package com.viniciussntn.traversal;

import com.viniciussntn.nodes.*;

public abstract class Traversal {

    protected String text = "";

    public abstract void assemble(Node root);

    public abstract String getText();
    public abstract void setText(String text);
}
