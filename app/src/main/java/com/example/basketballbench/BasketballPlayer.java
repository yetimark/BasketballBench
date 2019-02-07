package com.example.basketballbench;

public class BasketballPlayer
{
    //Fields
    private String name;
    private int jerseyNum;
    private int age;
    private int heightFeet;
    private int heightInches;

    //Constructor
    public BasketballPlayer(String name, int jerseyNum, int age, int heightFeet, int heightInches)
    {
        this.name = name;
        this.jerseyNum = jerseyNum;
        this.age = age;
        this.heightFeet = heightFeet;
        this.heightInches = heightInches;
    }

    //Methods
    public void displayPlayer()
    {
        System.out.format("%s is number %d. And at the age of %d years old, he/she stands %d feet and %d inches tall.\n",
                this.name, this.jerseyNum, this.age, this.heightFeet, this.heightInches);
    }

    public String PlayerInfoString()
    {
        return String.format("%s #%d (%d years old) %d' %d\"", this.name, this.jerseyNum, this.age, this.heightFeet, this.heightInches);
    }

    //Getters
    public String getName()
    {
        return this.name;
    }

    public int getJerseyNum()
    {
        return this.jerseyNum;
    }

    public int getAge()
    {
        return this.age;
    }

    public int getHeightFeet()
    {
        return this.heightFeet;
    }

    public int getHeightInches()
    {
        return this.heightInches;
    }
}
