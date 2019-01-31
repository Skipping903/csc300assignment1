package com.example.lukealbiero.csc300assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addNewPlayerClicked(View v)
    {
        Intent i = new Intent(this, Addnewplayer.class);
        this.startActivity(i);
    }
}//class
