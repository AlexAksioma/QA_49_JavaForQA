package lesson08_oop;

public class Person {

    private long id;
    private String name;
    private String surname;
    private int age;

    public Person() {
    }

    public Person(long id, String name, String surname, int age) {
        //this.id = id;
        setId(id);
        //this.name = name;
        setName(name);
        //this.surname = surname;
        setSurname(surname);
        //this.age = age;
        setAge(age);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if (id > 0)
            this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty())
            this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname != null && !surname.isEmpty())
            this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ": name='" + name + '\'' +
                ": surname='" + surname + '\'' +
                ": age=" + age +
                '}';
    }

    public boolean isAdult() {
        if (this.age >= 18) //(age >= 18)
            return true;
        return false;
    }
}
