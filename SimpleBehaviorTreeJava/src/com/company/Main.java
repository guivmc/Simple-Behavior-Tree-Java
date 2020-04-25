package com.company;

import java.util.Random;

public class Main {

    public static Random rand;

    public static boolean smashedDoor = false;

    public static void main(String[] args) {

         Main.rand = new Random();

        SequenceNode root = new SequenceNode();
        WalkToDoor walkToDoor = new WalkToDoor();
        SelectorNode selectorNode = new SelectorNode();
        OpenDoor openDoor = new OpenDoor();
        DoTIllSuccessNode doTIllSuccessNode = new DoTIllSuccessNode();
        SmashDoor smashDoor = new SmashDoor();
        SuccederNode succederNode = new SuccederNode();
        CloseDoor closeDoor = new CloseDoor();

        root.children.add(walkToDoor);
        selectorNode.children.add(openDoor);
        doTIllSuccessNode.children.add(smashDoor);
        selectorNode.children.add(doTIllSuccessNode);
        root.children.add(selectorNode);
        succederNode.children.add(closeDoor);
        root.children.add(succederNode);

        System.out.println(root.execute().name());

    }
}
