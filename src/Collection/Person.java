package Collection;

import java.time.LocalDate;

public class Person {
    String name;
    int age;
    LocalDate dateOfJoining;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public Person(String name, int age, LocalDate dateOfJoining) {
        this.name = name;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
    }

}
