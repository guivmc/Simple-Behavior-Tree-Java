package com.company;

public class SmashDoor extends Node {
    @Override
    public NodeState execute() {
        this.state = NodeState.Executing;

        if( 50 < Main.rand.nextInt(100) + 1)
        {
            Main.smashedDoor = true;
            System.out.println("Door smashed.");
            this.state = NodeState.Success;
        }
        else
        {
            System.out.println("Smashing door.");
            this.state = NodeState.Fail;
        }

        return this.state;
    }
}
