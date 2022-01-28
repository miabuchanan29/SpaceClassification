//Filename: CMoon.java
//Description: Class to encapsulate the properties of a Moon.
//Author: Mia Buchanan
//Date Last Modfied: 12.14.21

public class CMoon extends COtherObject {
    
    //Member Variables

    //Constructors
    public CMoon()
    {
        System.out.println("Moon created.");
    }

    //Accessor Functions

    public void setDistance(double d)
    {
        this.distance = d;
    }

    public void setname(String n)
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
