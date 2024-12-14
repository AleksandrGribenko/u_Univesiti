package HW_Enum;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        char letter = 'ь';
        int position = Alphabet.getPosition(letter);

        if (position != -1) {
            System.out.println("Позиция буквы " + letter + ": " + position);
        } else {
            System.out.println("Буква не найдена в алфавите.");
        }
        //
        List<Person> people = new ArrayList<>();
        people.add(new Person("Иван", 25, Person.Gender.MALE));
        people.add(new Person("Мария", 30, Person.Gender.FEMALE));
        people.add(new Person("Алексей", 22, Person.Gender.MALE));
        people.add(new Person("Анна", 28, Person.Gender.FEMALE));
        people.add(new Person("Дмитрий", 35, Person.Gender.MALE));
        people.add(new Person("Елена", 27, Person.Gender.FEMALE));
        people.add(new Person("Сергей", 32, Person.Gender.MALE));
        people.add(new Person("Ольга", 24, Person.Gender.FEMALE));
        people.add(new Person("Анатолий", 40, Person.Gender.MALE));
        people.add(new Person("Татьяна", 29, Person.Gender.FEMALE));

        List<Person> males = filterByGender(people, Person.Gender.MALE);
        List<Person> females = filterByGender(people, Person.Gender.FEMALE);

        System.out.println("Список мужчин:");
        males.forEach(person -> System.out.println(person.getName() + ", " + person.getAge() + " лет"));
        System.out.println();
        System.out.println("Список женщин:");
        females.forEach(person -> System.out.println(person.getName() + ", " + person.getAge() + " лет"));
    }

    public static List<Person> filterByGender(List<Person> people, Person.Gender gender) {
        return people.stream()
                .filter(person -> person.getGender() == gender)
                .collect(Collectors.toList());
    }
}

