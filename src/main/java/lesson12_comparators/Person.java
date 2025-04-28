package lesson12_comparators;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable<Person>{
    private int id;
    private String name;
    private LocalDate birth;

    public Person() {
    }

    public Person(int id, String name, LocalDate birth) {
        this.id = id;
        this.name = name;
        this.birth = birth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name) && Objects.equals(birth, person.birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birth);
    }

    @Override    //person1.compareTo(anotherPerson)
    public int compareTo(Person anotherPerson) {
        //if person1.compareTo(anotherPerson)<0 person1<anotherPerson
        //if person1.compareTo(anotherPerson)>0 person1>anotherPerson
        //if person1.compareTo(anotherPerson)=0 person1==anotherPerson
        int id1 = this.id;
        int id2 = anotherPerson.id;
        return id1 - id2;
    }
    /*
    id --> 10 , 12, 33, 45
    if person1.id - anotherPerson.id
        <0 person1<another
        >0 person1>another
        =0 person1==another
     */
}
