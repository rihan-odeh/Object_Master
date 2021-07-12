package com.example.object_master;

public class Human {
    private int strength, stealth, intelligence, health, wizardCount , ninjaCount , samuraiCount;

    public Human() {
        stealth = 3;
        strength = 3;
        intelligence = 3;
        health = 100;
        wizardCount=0;
        ninjaCount=0;
        samuraiCount=0;
    }
    // public Human(int strength, int stealth, int )

    public int getHealth() {
        return health;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getStealth() {
        return stealth;
    }

    public int getStrength() {
        return strength;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void attack(Human human) {
        human.health -= this.strength;
    }

    public int getNinjaCount() {
        return ninjaCount;
    }

    public int getSamuraiCount() {
        return samuraiCount;
    }

    public int getWizardCount() {
        return wizardCount;
    }

    public void setNinjaCount(int ninjaCount) {
        this.ninjaCount = ninjaCount;
    }

    public void setSamuraiCount(int samuraiCount) {
        this.samuraiCount = samuraiCount;
    }

    public void setWizardCount(int wizardCount) {
        this.wizardCount = wizardCount;
    }
}
