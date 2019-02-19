package com.example.lukealbiero.csc300assignment1;

import android.content.Context;
import android.graphics.Movie;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class BballPlayerArrayAdapter extends ArrayAdapter
{
    private Context mContext;
    private BballPlayer[] thePlayers = new BballPlayer[1000];
    private int textViewResourceId;

    public BballPlayerArrayAdapter(Context context, int textViewResourceId, BballPlayer[] list)
    {
        super(context, textViewResourceId , list);
        this.mContext = context;
        this.thePlayers = list;
        this.textViewResourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View listItem = convertView;
        if(listItem == null)
        {
            listItem = LayoutInflater.from(this.mContext).
                    inflate(this.textViewResourceId,parent,false);
        }

        BballPlayer player = this.thePlayers[position];

        TextView nameTV = (TextView)listItem.findViewById(R.id.nameTV);
        TextView jerseyTV = (TextView)listItem.findViewById(R.id.jerseyTV);
        TextView ageTV = (TextView)listItem.findViewById(R.id.ageTV);
        TextView height_ftTV = (TextView)listItem.findViewById(R.id.height_ftTV);
        TextView height_inTV = (TextView)listItem.findViewById(R.id.height_inTV);

        nameTV.setText(player.getNameString());
        jerseyTV.setText(player.getJerseyString());
        ageTV.setText(player.getAgeString());
        height_ftTV.setText(player.getHeightFtString());
        height_inTV.setText(player.getHeightInString());

        return listItem;
    }
}//class
