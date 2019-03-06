package com.example.lukealbiero.csc300assignment1;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Core
{
    public static BballPlayer[] thePlayers = new BballPlayer[1000];
    public static String[] playerStrings = new String[1000];
    private static int numberOfPlayers = 0;
    private static FirebaseDatabase database = FirebaseDatabase.getInstance();
    public static DatabaseReference myRef = database.getReference("players");
    public static BballPlayerArrayAdapter aa;

    /*public static String[] getThePlayerStrings()
    {
        return Core.getThePlayerStrings();
    }*/

    public static void listenForDatabaseChanges()
    {
        //async listener
        ValueEventListener playerListener = new ValueEventListener()
        {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot)
            {
                System.out.println(dataSnapshot.getValue());
                Core.numberOfPlayers = 0;
                for(DataSnapshot ds: dataSnapshot.getChildren())
                {
                    BballPlayer player = ds.getValue(BballPlayer.class);
                    Core.AddNewPlayerLocal(player);
                    //player.display();
                }
               Core.aa.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(DatabaseError databaseError)
            {
                // Getting Post failed, log a message
                System.out.println("loadPost:onCancelled " + databaseError.toException());
            }
        };
        Core.myRef.addValueEventListener(playerListener);
    }

    public static void writeBballPlayerToFirebase(BballPlayer player)
    {
        //static context
        Core.myRef.push().setValue(player);
    }

    public static void AddNewPlayerLocal(BballPlayer player)
    {
        Core.thePlayers[Core.numberOfPlayers] = player;
        Core.playerStrings[Core.numberOfPlayers] = player.toString();
        Core.numberOfPlayers++;
        //Core.writeBballPlayerToFirebase(player);
    }

    public static void AddBballPlayerDB(BballPlayer player)
    {
        Core.writeBballPlayerToFirebase(player);
    }
}
