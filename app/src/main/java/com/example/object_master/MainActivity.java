package com.example.object_master;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Human human;
    EditText editText;
    Human humanAttacked;
    Samurai samurai ;
    Wizard wizard;
    Ninja ninja;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        human = new Human();
        samurai = new Samurai();
        wizard = new Wizard();
        ninja = new Ninja();
        humanAttacked = new Human();
        editText = findViewById(R.id.properties);
     /*   human.attack(humanAttacked);
        human.attack(humanAttacked);
        human.attack(humanAttacked);
        editText.setText(String.valueOf(humanAttacked.getHealth()));*/
        wizard.heal(samurai);
        editText.setText(String.valueOf(samurai.getHealth()));


    }
}