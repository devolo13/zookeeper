package com.dlozano.zookeeper;

public class vampire extends mammal{
    public vampire(){
        super();
        this.energy = 300;
    }

    public int fly(){
        this.changeEnergy(-50);
        return this.getEnergy();
    }

    public int eat(){
        this.changeEnergy(+25);
        return this.getEnergy();
    }

    public int attack(){
        this.changeEnergy(-100);
        return this.getEnergy();
    }
}
