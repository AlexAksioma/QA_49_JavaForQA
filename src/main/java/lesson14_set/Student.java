package lesson14_set;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double grade;

    public Student() {
    }

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Double.compare(grade, student.grade) == 0
                && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, grade);
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student another) {
        int result = Integer.compare(id, another.id);
        if (result != 0)
            return result;
        result = Double.compare(grade, another.grade);
        if (result != 0)
            return result;
        return name.compareToIgnoreCase(another.name);
    }
}
