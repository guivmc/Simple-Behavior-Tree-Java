package com.company;

import java.util.ArrayList;

public abstract class Node {

    public NodeState state;

    public ArrayList<Node> children = new ArrayList<>();

    public abstract NodeState execute();
}
