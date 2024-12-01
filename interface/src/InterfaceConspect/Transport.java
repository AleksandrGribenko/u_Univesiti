package InterfaceConspect;

public class Transport implements Movable{
    String type;
    int speed;

    public Transport(String type, int speed) {
        this.type = type;
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("Движется со скоростью " + speed);
    }
}
