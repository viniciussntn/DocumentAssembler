package com.viniciussntn.nodes;

import java.util.ArrayList;

public class Branch extends Node {

    private final ArrayList<Node> subNodes = new ArrayList<>();

    public String getText() {
        return null;
    }

    public void addNode(Node child) {

        child.setNivel(this.getNivel() + 1);
        subNodes.add(child);
    }

    public void removeNode(Node child) {

        subNodes.remove(child);
    }

    public int getGrau() {
        int grau = 0;

        for (Node subNo : subNodes) {

            grau++;
            grau += subNo.getGrau();
        }

        return grau;
    }

    // n tá pronto
    public int getAltura() {

        int alturaBase = this.getNivel();
        int maiorAltura = alturaBase;

        for (Node node : subNodes) {

            if (node.getNivel() > maiorAltura) {
                maiorAltura = node.getNivel();
                node.getAltura();
            }
        }
        return (maiorAltura - alturaBase);
    }

    public ArrayList<Node> getSubNos() {
        return this.subNodes;
    }
}
