package com.example.lukealbiero.csc300assignment1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.google.firebase.database.*;

public class MainActivity extends AppCompatActivity
{
    private ListView lv;
    //private BballPlayerArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        for(int i = 0; i < Core.playerStrings.length; i++)
        {
            Core.thePlayers[i] = new BballPlayer();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Core.aa = new BballPlayerArrayAdapter(this, R.layout.list_view_row_advanced, Core.thePlayers);
        this.lv = (ListView)this.findViewById(R.id.listView);
        this.lv.setAdapter(Core.aa);

        Core.listenForDatabaseChanges();
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        //lv.invalidateViews();
        Core.aa.notifyDataSetChanged();
    }

    public void addNewPlayerClicked(View v)
    {
        Intent i = new Intent(this, Addnewplayer.class);
        this.startActivity(i);
    }
}//class
