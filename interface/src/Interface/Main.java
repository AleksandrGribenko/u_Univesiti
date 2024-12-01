package Interface;

import InterfaceConspect.Movable;

public class Main {
    public static void main(String[] args) {

        Human human = new Human("Василий", 35, "самолет");
        human.readyToFly("самолет");
        human.readyToSwim("пароход");
        Human human2 = new Human("Иван", 30, "пароход");
        human2.readyToSwim("пароход");
        Birds bird1 = new Birds("утка");
        bird1.readyToFly("");
        bird1.readyToSwim("");
        Birds birds2 = new Birds("голубь");
        birds2.readyToFly("");
        birds2.readyToSwim("");
        Fish fish = new Fish("карась", 3);
        fish.readyToFly("");
        fish.readyToSwim("");
    }


}
