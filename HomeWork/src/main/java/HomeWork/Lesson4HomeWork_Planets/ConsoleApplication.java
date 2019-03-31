package HomeWork.Lesson4HomeWork_Planets;

public class ConsoleApplication {
    public static void main(String[] args) {
        Moon moon1 = new Moon("Moon1");
        Moon moon2 = new Moon("Moon2");
        Star star1 = new Star("Star1");
        Star star2 = new Star("Star2");
        Planet planet1 = new Planet("Planet1");
        Planet planet2 = new Planet("Planet2");

        SolarSystem solarSystem = new SolarSystem();
        solarSystem.addPlanetToSolarSystem(moon1);
        solarSystem.addPlanetToSolarSystem(moon2);
        solarSystem.addPlanetToSolarSystem(star1);
        solarSystem.addPlanetToSolarSystem(star2);
        solarSystem.addPlanetToSolarSystem(planet1);
        solarSystem.addPlanetToSolarSystem(planet2);

        solarSystem.printAmountOfPlanets();
    }
}
