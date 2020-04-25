package com.company;

public class CloseDoor extends Node {
    @Override
    public NodeState execute() {
        this.state = NodeState.Executing;

        if( Main.smashedDoor)
        {
            System.out.println("Can't close the door.");
            this.state = NodeState.Fail;
        }
        else
        {
            System.out.println("Door closed.");
            this.state = NodeState.Success;
        }

        return this.state;
    }
}
