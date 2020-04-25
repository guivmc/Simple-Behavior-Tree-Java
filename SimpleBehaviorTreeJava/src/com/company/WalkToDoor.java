package com.company;

public class WalkToDoor extends Node {

    @Override
    public NodeState execute() {

        this.state = NodeState.Executing;

        if( 20 < Main.rand.nextInt(100) + 1)
        {
            System.out.println("Walking to the door.");
            this.state = NodeState.Success;
        }
        else
        {
            System.out.println("Can't walk to the door.");
            this.state = NodeState.Fail;
        }

        return this.state;
    }
}
