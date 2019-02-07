package com.example.lukealbiero.csc300assignment1;

public class BballPlayer
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

    @Override
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
