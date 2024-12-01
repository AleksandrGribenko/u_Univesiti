package Interface;

public class Human implements Flyable, Swimmable {  //
    String name;
    int age;
    String technicalEquipment;

    public Human(String name, int age, String technicalEquipment) {
        this.name = name;
        this.age = age;
        this.technicalEquipment = technicalEquipment;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void readyToFly(String technicalEquipment) {
        System.out.println(name + " " + age);
        Flyable.getInfoAboutFly(technicalEquipment);
    }

    @Override
    public void readyToSwim(String technicalEquipment) {
        System.out.println(name + " " + age);
        Swimmable.getInfoAboutSwim(technicalEquipment);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
