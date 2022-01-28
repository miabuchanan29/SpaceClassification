//Filename: CRockyPlanet.java
//Description: Class to encapsualte the properties of a rocky/terrestrial planet
//Author: Mia Buchanan
//Date Last Modified: 12.14.21

public class CRockyPlanet extends CPlanet {
    
    //Member Variables

    //Constructors
    public CRockyPlanet()
    {
        System.out.println("Rocky planet created.");
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
