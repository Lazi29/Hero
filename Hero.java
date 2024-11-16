import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Hero
{ 
    public Hero(String name, int powerLevel, String team) 
    {
        this.name = name;
        this.powerLevel = powerLevel;
        this.team = affiliation;
    }

    public String getname(){
        return name;
    }
    public int getpowerLevel(){
        return powerLevel;
    }
    public String getteam(){
        return affiliation;
    }


    public String toString(){
        return "Hero Name: " + name + "\n " + "Power Level: " + powerLevel + "\n" + "Hero Affiliation: " + team;
    }
}