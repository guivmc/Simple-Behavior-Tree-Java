package com.company;

public class OpenDoor extends Node {
    @Override
    public NodeState execute() {

        this.state = NodeState.Executing;

        if( 80 < Main.rand.nextInt(100) + 1)
        {
            System.out.println("Opening door.");
            this.state = NodeState.Success;
        }
        else
        {
            System.out.println("Can't open the door.");
            this.state = NodeState.Fail;
        }

        return this.state;

    }
}
