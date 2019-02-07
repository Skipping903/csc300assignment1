package com.example.lukealbiero.csc300assignment1;

public class Core
{
    private static BballPlayer[] thePlayers = new BballPlayer[1000];
    public static String[] playerStrings = new String[1000];
    private static int numberOfPlayers = 0;

    /*public static String[] getThePlayerStrings()
    {
        return Core.getThePlayerStrings();
    }*/

    public static void AddNewPlayer(BballPlayer player)
    {
        Core.thePlayers[Core.numberOfPlayers] = player;
        Core.playerStrings[Core.numberOfPlayers] = player.toString();
        Core.numberOfPlayers++;
    }
}
