package HomeWork.Lesson4HomeWork_Planets;

public class Moon extends SpaceObject {
    public Moon(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I'm a Moon");
    }
}
