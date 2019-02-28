package com.example.lukealbiero.csc300assignment1;

import com.google.firebase.database.Exclude;
import java.io.Serializable;

public class BballPlayer implements Serializable
{
    private String name;
    private int jersey_number, age, height_feet, height_inches;

    public BballPlayer(String name, int jersey_number, int age, int height_feet, int height_inches)
    {
        this.name = name;
        this.jersey_number = jersey_number;
        this.age = age;
        this.height_feet = height_feet;
        this.height_inches = height_inches;
    }

    public BballPlayer()
    {
        this.name = "NAME";
        this.jersey_number = 0;
        this.age = 0;
        this.height_feet = 0;
        this.height_inches = 0;
    }


    public String getNameString()
    {
        return this.name;
    }


    public String getJerseyString()
    {
        return "Jersey Number: (" + this.jersey_number + ")";
    }


    public String getAgeString()
    {
        return "Age: (" + this.age + ")";
    }


    public String getHeightFtString()
    {
        return "Height(ft): (" + this.height_feet + ")";
    }


    public String getHeightInString()
    {
        return "Height(in): (" + this.height_inches + ")";
    }


    public String toString()
    {
        return this.name + " Jersey Number: " + this.jersey_number + " Age: "
                + this.age + " Inches: " + this.height_inches + " Feet: " + this.height_feet;
    }

    public void display()
    {
        System.out.println(this.name + " Jersey Number: " + this.jersey_number + " Age: "
                + this.age + " Inches: " + this.height_inches + " Feet: " + this.height_feet);
    }
}//class
