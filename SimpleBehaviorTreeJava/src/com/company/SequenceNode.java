package com.company;

public class SequenceNode extends Node {

    @Override
    public NodeState execute() {

        this.state = NodeState.Executing;

        for ( Node n: children)
        {
            if( n.execute() == NodeState.Fail)
            {
                this.state = NodeState.Fail;

                return this.state;
            }
        }

        this.state = NodeState.Success;

        return this.state;
    }
}
