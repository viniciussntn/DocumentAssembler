package com.viniciussntn.nodes;

import java.util.ArrayList;

public abstract class Node {

    private int profundidade;
    private int altura;
    private int grau;
    private int nivel;

    public abstract String getText();

    public abstract int getGrau();

    public abstract int getAltura();

    public abstract ArrayList<Node> getSubNos();

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
