package com.example.object_master;

public class Wizard extends Human{
    public Wizard(){
        super.setHealth(50);
        super.setIntelligence(8);
        super.setWizardCount(super.getWizardCount()+1);

    }
    public void heal(Human human){
        human.setHealth(super.getIntelligence());

    }
    public void fireBall(Human human ){
        human.setHealth(human.getHealth()- 3*super.getIntelligence());
    }

}
