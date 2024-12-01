package InterfaceConspect;

public interface Movable {
    void move();

    static void getInfoAboutMovable() {


        System.out.println("У объекта этого класса использован интерфейс");
    }
    default void defaultMethod(){
        System.out.println("Это обычный дефолтный метод");
    }

}

