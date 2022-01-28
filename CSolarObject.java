//Filename: SolarObject.java
//Description: Class to encapsualte the properties of space objects
//Author: Mia Buchanan
//Date Last Modified: 12.14.21

public abstract class CSolarObject {
    
    //Member Variables
    protected double distance;
    protected String name;
    

    //Constructors
    public CSolarObject()
    {
        System.out.println("Space object created.");
    }

    //Accessor Functions
    public void setName(String n) 
    {
        this.name = n;
    }

    public void setDistance(double d)
    {
        this.distance = d;
    }

   

    //Memeber Functions
    public abstract void printInfo();

    public void setNumMoons(int i) {
    }

    
}
