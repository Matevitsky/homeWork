package HomeWork.Lesson4HomeWork_Planets;

import java.util.Objects;

public abstract class SpaceObject {
    private final String name;

    public SpaceObject(String name) {
        this.name = name;
    }

    public abstract void print();

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SpaceObject{" +
            "name='" + name + '\'' +
            '}';
    }


    public boolean equals(SpaceObject spaceObject) {
        if (this == spaceObject) return true;
        return spaceObject.name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
