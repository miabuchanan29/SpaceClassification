//Filename: SpaceJava.java
//Description: The main entry point for space objects
//Author: Mia Buchanan
//Date Last Modified: 12.14.21

public class SpaceJava {

    public static void main(String args[])
    {
        System.out.println("Welcome to Space Java");
        
        final int NUM_OBJECTS = 14;
        CSolarObject[] obj = new CSolarObject[NUM_OBJECTS];

        obj[0] = new CDwarf();
        obj[0].setName("Ceres");
        obj[0].setDistance(1.770120);
        obj[0].setNumMoons(0);
        obj[0].printInfo();

        obj[1] = new CDwarf();
        obj[1].setName("Pluto");
        obj[1].setDistance(28.0);
        obj[1].setNumMoons(0);
        obj[1].printInfo();

        obj[2] = new CRockyPlanet();
        obj[2].setName("Mars");
        obj[2].setDistance(2.422507);
        obj[2].setNumMoons(2);
        obj[2].printInfo();

        obj[3] = new CRockyPlanet();
        obj[3].setName("Earth");
        obj[3].setDistance(0.0);
        obj[3].setNumMoons(1);
        obj[3].printInfo();

        obj[4] = new CGasGiant();
        obj[4].setName("Jupiter");
        obj[4].setDistance(5.347256);
        obj[4].setNumMoons(79);
        obj[4].printInfo();

        obj[5] = new CGasGiant();
        obj[5].setName("Saturn");
        obj[5].setDistance(7.0);
        obj[5].setNumMoons(82);
        obj[5].printInfo();

        obj[6] = new CStar();
        obj[6].setName("Alpha Centauri A");
        obj[6].setDistance(276173.78);
        obj[6].printInfo();

        obj[7] = new CStar();
        obj[7].setName("Proxima Centauri B");
        obj[7].setDistance(268142.2);
        obj[7].printInfo();

        obj[8] = new CComet();
        obj[8].setName("Leonard");
        obj[8].setDistance(5.0);
        obj[8].printInfo();

        obj[9] = new CComet();
        obj[9].setName("Borrelly");
        obj[9].setDistance(1.358);
        obj[9].printInfo();

        obj[10] = new CMoon();
        obj[10].setName("Moon (Earth's only moon)");
        obj[10].setDistance(0.00257);
        obj[10].printInfo();

        obj[11] = new CMoon();
        obj[11].setName("Ganymede");
        obj[11].setDistance(4.1998);
        obj[11].printInfo();

        obj[12] = new CAsteroid();
        obj[12].setName("10199 Chariklo");
        obj[12].setDistance(18.49);
        obj[12].printInfo();

        obj[13] = new CAsteroid();
        obj[13].setName("243 Ida");
        obj[13].setDistance(2.743);
        obj[13].printInfo();
    }
}