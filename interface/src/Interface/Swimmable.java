package Interface;

public interface Swimmable {
    String UTKA = "утка";
    String ship = "пароход";
    String FISH = "карась";

    void readyToSwim(String technicalEquipment);

    static void getInfoAboutSwim(String name) {
        if (name == ship) {
            System.out.println("Способен плыть на пароходе");
        } else if (name == UTKA) {
            System.out.println("Замечательно плавает и не тонет");
        } else if (name==FISH) {
            System.out.println("Плавает как рыба");
        } else {
            System.out.println("Плавать не может");
        }
    }

}
