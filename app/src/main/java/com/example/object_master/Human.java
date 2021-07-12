package com.example.object_master;

public class Human {
    private int strength, stealth, intelligence, health;

    public Human() {
        stealth = 3;
        strength = 3;
        intelligence = 3;
        health =100;
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
    public void attack(Human human){
        human.health -= this.strength;
    }
}
