package com.viniciussntn.traversal;

import com.viniciussntn.nodes.*;

public class inOrder extends Traversal {

    public void assemble(Node root) {

        if (root instanceof Leaf) {

            this.setText( root.getText() + " ");

        } else if (root instanceof Branch) {

            for (Node subNode : root.getSubNos()) {

                assemble(subNode);
            }
        }
    }

    public String getText() {

        return this.text;
    }

    public void setText(String text) {

        this.text += text;
    }


}
