package Interface;

public class Fish implements Swimmable, Flyable {
    String name;
    int weight;

    public Fish(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void readyToFly(String technicalEquipment) {
        System.out.println(name);
        Flyable.getInfoAboutFly("");
    }

    @Override
    public void readyToSwim(String technicalEquipment) {
        System.out.println(name);
        Swimmable.getInfoAboutSwim(name);
    }
}
