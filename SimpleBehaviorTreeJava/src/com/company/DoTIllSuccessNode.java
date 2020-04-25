package com.company;

public class DoTIllSuccessNode extends Node {
    @Override
    public NodeState execute() {

        NodeState childSate;

        this.state = NodeState.Executing;

        do{

            childSate = children.get(0).execute();

        }while (childSate != NodeState.Success);

        this.state = NodeState.Success;

        return this.state;

    }
}
