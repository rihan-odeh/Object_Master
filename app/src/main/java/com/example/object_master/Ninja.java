package com.example.object_master;

public class Ninja extends Human{
    public Ninja(){
        super.setStealth(10);
        super.setNinjaCount(super.getNinjaCount()+1);

    }
    public void steal(Human human ){
        int newStealth= human.getStealth();
        human.setHealth(human.getHealth()-newStealth);
        human.setStealth(0);
        this.setStealth(newStealth);


    }
    public void runAway(){
        this.setHealth(this.getHealth()-10);
    }
}
