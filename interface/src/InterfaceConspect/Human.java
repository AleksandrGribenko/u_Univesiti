package InterfaceConspect;

public class Human implements Movable, Condition{   //
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public void move() {
        System.out.println("Передвигается пешком");
    }

    @Override
    public void readyToWork(int age) {
        if(age>=READY){
            System.out.println("Может работать");
        } else {
            System.out.println("Не может работать");
        }
    }
}
