//Filename: CComet.java
//Description: A class to encapsulate the properties of a comet.
//Author: Mia Buchanan
//Date Last Modified: 12.14.21

public class CComet extends COtherObject {

    //Member Variables

    //Constructors
    public CComet() 
    {
        System.out.println("Comet created.");
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

    public double getDistance() {return distance;}
    public String getName() {return name;}

    //Member Functions
    public void printInfo()
    {
        System.out.println("Name: " + getName());
        System.out.println("Distance from Earth (astronomical units): " + getDistance());
        return;
    }
    
}
