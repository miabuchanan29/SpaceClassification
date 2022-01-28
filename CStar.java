//Filename: CStar.java
//Description: Class to encapsulate the properties of a star.
//Author: Mia Buchanan
//Date Last Modified: 12.14.21

public class CStar extends CSolarObject{

    //Member Variables

    //Constructors
    public CStar()
    {
        System.out.println("Star created.");
    }

    //Accessor Functions
    public void setDistance(double d)
    {   
        this.distance = d;
    }

    public void setName(String n)
    {
        this.name = n;
    }

    public String getName() {return this.name;}

    public double getDistance() {return this.distance;}

    //Member Functions
    public void printInfo()
    {
        System.out.println("Name: " + getName());
        System.out.println("Distance from Earth (astronomical units): " + getDistance());
        return;
    }
}
