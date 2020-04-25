package com.company;

public class SelectorNode extends Node
{
    @Override
    public NodeState execute() {

        this.state = NodeState.Executing;

        for ( Node n: children)
        {
            if( n.execute() == NodeState.Success)
            {
                this.state = NodeState.Success;

                return this.state;
            }
        }

        this.state = NodeState.Fail;

        return this.state;
    }
}
