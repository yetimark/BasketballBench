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

    //a litman thing to set strings and zeros for all items
    public static void setTheBench()
    {
        for(int i = 0; i < Core.theBench.length; i++)
        {
            Core.theBench[i] = new BasketballPlayer();
        }
    }


    public static BasketballPlayer[] getTheBench()
    {
        return Core.theBench;
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

    //Displays the player name to the console (for testing)
    public static void DisplayBench()
    {
        for (int i = 0; i < Core.numberOfPlayers; i++)
        {
            System.out.println(Core.theBench[i].getNameString());
        }
    }
}
