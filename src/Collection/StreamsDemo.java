package Collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsDemo {
    private static int numbersAdded;

    public static int getNumbersAdded() {
        return numbersAdded;
    }

    static void getPersonNameWhereAgeIsLessThanOrEqualsToTwenty(Person... person){
        List<Person> listEmp = new ArrayList<>(Arrays.asList(person));
        listEmp.stream().filter(t -> {numbersAdded++; return t.getAge() <= 20; }).forEach(t -> System.out.println(t.getName()));

    }
    public static void main(String[] args) {
        Person person = new Person("emma", 20, LocalDate.of(2000, 2, 2));
        Person person1 = new Person("john", 30, LocalDate.of(2000, 3, 2));
        Person person2 = new Person("sam", 18, LocalDate.of(2002, 1, 25));
        getPersonNameWhereAgeIsLessThanOrEqualsToTwenty(person, person1, person2);
        System.out.println("Numbers Of Emp Added: " + getNumbersAdded());

    }
}
