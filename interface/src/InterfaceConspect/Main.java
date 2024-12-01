package InterfaceConspect;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Иван",19);
        human.move();
        Movable.getInfoAboutMovable();
        human.defaultMethod();
        human.readyToWork(human.age);
        Transport transport =new Transport("Автомобиль",200);
        transport.move();
    }
}