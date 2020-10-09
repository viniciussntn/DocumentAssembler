package com.viniciussntn.traversal;

import com.viniciussntn.nodes.*;

public abstract class Traversal {

    protected String text = "";

    /**
     * @implNote guarda no objeto o texto contido na árvore
     * @param root referência à raiz
     */
    public abstract void assemble(Node root);

    /**
     * @return retorna o texto gerado com o método de percorrimento selecionado
     */
    public abstract String getText();
    public abstract void setText(String text);
}
