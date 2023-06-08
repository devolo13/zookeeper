package com.dlozano.zookeeper;

public class gorilla extends mammal{
    public gorilla (){
        super();
    }

    public int throwStuff () {
        this.changeEnergy(-5);
        System.out.println("throwing something. energy -5");
        return this.getEnergy();
    }

    public int eatBananas(){
        this.changeEnergy(10);
        System.out.println("eating bananas. energy +10");
        return this.getEnergy();
    }

    public int climb (){
        this.changeEnergy(-10);
        System.out.println("climbing. energy -10");
        return this.getEnergy();
    }
}
