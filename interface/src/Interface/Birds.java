package Interface;

public class Birds implements Flyable {
    String name;

    public Birds(String bird) {
        this.name = bird;
    }
    public void readyToFly(String technicalEquipment) {
        System.out.println(name);
        Flyable.getInfoAboutFly(name);


    }

    @Override
    public void readyToSwim(String technicalEquipment) {
        System.out.println(name);
        Swimmable.getInfoAboutSwim(name);

    }
//    @Override
//    public void readyToFly(String technicalEquipment) {
//        System.out.println(name);
//        Flyable.getInfoAboutFly(name);
//    }

//    public void readyToSwim(String technicalEquipment){
//        System.out.println(name);
//        Flyable.getInfoAboutSwim(name);
//    }

    @Override
    public String toString() {
        return "Birds{" +
                "name='" + name + '\'' +
                '}';
    }
}
