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

    public BasketballPlayer()
    {
        this.name = "First LastName";
        this.age = 0;
        this.jerseyNum = 0;
        this.heightFeet = 0;
        this.heightInches = 0;
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
    public String getNameString()
    {
        return this.name;
    }

    public String getJerseyNumString()
    {
        return "#" + this.jerseyNum;
    }

    public String getAgeString()
    {
        return this.age + " Years old";
    }

    public String getHeightString()
    {
        return this.heightFeet + "\' " + this.heightInches + "\" Tall";
    }

}
