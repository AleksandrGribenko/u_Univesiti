package Interface;

public interface Flyable {
    String FLY = "самолет";
    String UTKA = "утка";
    String PIGEON = "голубь";


    void readyToFly(String technicalEquipment);

    static void getInfoAboutFly(String name) {
        if (name == FLY) {
            System.out.println("Способен летать на самолете");
        } else if (name == UTKA || name == PIGEON) {
            System.out.println("Замечательно летает и не падает");
        } else {
            System.out.println("Летать не может");
        }
    }

    void readyToSwim(String technicalEquipment);
}
