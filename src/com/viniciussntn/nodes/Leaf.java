package com.viniciussntn.nodes;

import java.util.ArrayList;

public class Leaf extends Node {

    private String text;

    public Leaf(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public int getGrau() {
        return 0;
    }

    public int getAltura() {
        return 0;
    }

    public ArrayList<Node> getSubNos() {
        return null;
    }

}

