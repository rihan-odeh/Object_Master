package com.example.object_master;

public class Samurai extends Human {
    public Samurai(){
    this.setHealth(200);
        super.setSamuraiCount(super.getSamuraiCount()+1);
    }
    public void deathBlow(Human human){
        human.setIntelligence(0);
        human.setHealth(0);
        human.setStealth(0);
        human.setStrength(0);
        human = null;
        this.setHealth(this.getHealth()/2);
    }
    public void meditate(){
        this.setHealth(this.getHealth()+this.getHealth()/2);
    }
    public int howMany(){
        return super.getSamuraiCount();
    }

}
