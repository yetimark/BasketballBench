package com.example.basketballbench;

public class Core
{
    private static BasketballPlayer[] theBench = new BasketballPlayer[15];
    private static int numberOfPlayers = 0;

    //player data
    public static void addBasketballPlayer(BasketballPlayer player)
    {
        Core.theBench[numberOfPlayers] = player;
        Core.numberOfPlayers++;
    }

    //returns player info in strings
    public static String[] getTheBenchString()
    {
        String[] stringBench = new String[Core.numberOfPlayers];

        for(int i = 0; i < Core.numberOfPlayers; i++)
        {
            stringBench[i] = Core.theBench[i].PlayerInfoString();
        }

        return stringBench;
    }
}
