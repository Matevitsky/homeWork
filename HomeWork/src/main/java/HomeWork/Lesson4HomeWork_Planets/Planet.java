package HomeWork.Lesson4HomeWork_Planets;

public class Planet extends SpaceObject {
    public Planet(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I'm a Planet");
    }
}
