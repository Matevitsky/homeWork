package HomeWork.Lesson4HomeWork_Planets;

import java.util.ArrayList;
import java.util.List;

public class SolarSystem {

    private final List<SpaceObject> solarSystemList;

    public SolarSystem() {
        this.solarSystemList = new ArrayList<>();
    }

    public void printAmountOfPlanets() {
        for (SpaceObject aSolarSystemList : solarSystemList) {
            System.out.println(aSolarSystemList);
        }
        System.out.println("Amount of Planets " + solarSystemList.size());
    }

    public void addPlanetToSolarSystem(SpaceObject spaceObject) {
        solarSystemList.add(spaceObject);
    }
}
