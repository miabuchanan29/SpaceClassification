//Filename: CGasGiant.java
//Description: Class to encapsulate the properties of a Gas Giant.
//Author: Mia Buchanan
//Date Last Modified: 12.14.21

public class CGasGiant extends CPlanet {

    //Memeber Variables

    //Constructors
    public CGasGiant()
    {
        System.out.println("Gas Giant created.");
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

    public void setNumMoons(int m)
    {
        this.numMoons = m;
    }

    public String getName() {return name;}

    public double getDistance() {return distance;}

    public int getNumMoons() {return numMoons;}



    //Member Functions
    
    public void printInfo()
    {
        System.out.println("Name: " + getName());
        System.out.println("Distance from Earth (astronomical units): " + getDistance());
        System.out.println("Number of Moons: " + getNumMoons());
        return;
    }
    
}
