package com.company;

public class SuccederNode extends Node {
    @Override
    public NodeState execute() {

        this.state = NodeState.Executing;

        children.get(0).execute();

        this.state = NodeState.Success;

        return  this.state;
    }
}
