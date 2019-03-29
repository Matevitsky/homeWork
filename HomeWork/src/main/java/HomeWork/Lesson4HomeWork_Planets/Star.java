package HomeWork.Lesson4HomeWork_Planets;

public class Star extends SpaceObject {
    public Star(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I'm a star");
    }
}
