package com.example.lukealbiero.csc300assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Addnewplayer extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addnewplayer);
    }

    public void onAddButtonPressed(View v)
    {
        EditText nameET = (EditText)this.findViewById(R.id.nameET);
        EditText jerseynumberET = (EditText)this.findViewById(R.id.jerseynumberET);
        EditText ageET = (EditText)this.findViewById(R.id.ageET);
        EditText heightinchesET = (EditText)this.findViewById(R.id.heightinchesET);
        EditText heightfeetET = (EditText)this.findViewById(R.id.heightfeetET);

        String name = nameET.getText().toString();
        int jerseyNumber = Integer.parseInt(jerseynumberET.getText().toString());
        int age = Integer.parseInt(ageET.getText().toString());
        int heighInches = Integer.parseInt(heightinchesET.getText().toString());
        int heightFeet = Integer.parseInt(heightfeetET.getText().toString());
        BballTeam bTeam = new BballTeam(name, jerseyNumber, age, heighInches, heightFeet);
        bTeam.display();
    }
}//class
