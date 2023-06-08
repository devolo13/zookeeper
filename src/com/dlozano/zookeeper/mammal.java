package com.dlozano.zookeeper;

public class mammal {
    protected int energy;

    public mammal (){
        this.energy = 100;
    }

    public int displayEnergy (){
        System.out.println(this.energy);
        return this.energy;
    }

    public int getEnergy(){
        return this.energy;
    }

    public int changeEnergy(int change){
        this.energy += change;
        return this.energy;
    }
}
