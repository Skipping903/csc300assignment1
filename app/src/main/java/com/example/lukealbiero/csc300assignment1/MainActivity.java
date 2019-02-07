package com.example.lukealbiero.csc300assignment1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        for(int i = 0; i < Core.playerStrings.length; i++)
        {
            Core.playerStrings[i] = "Empty Player";
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this.listView = (ListView)this.findViewById(R.id.listView);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, R.layout.list_view_row, Core.playerStrings);
        this.lv = (ListView)this.findViewById(R.id.listView);
        lv.setAdapter(aa);
    }

    public void addNewPlayerClicked(View v)
    {
        Intent i = new Intent(this, Addnewplayer.class);
        this.startActivity(i);
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        lv.invalidateViews();
    }
}//class
