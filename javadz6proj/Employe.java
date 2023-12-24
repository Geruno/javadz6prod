package javadz6proj;
import java.util.Objects;
public class Employe{
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public static void main(String[] args) {
        ;
    }

    public Employe(String firstName, String lastName, int age, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    public Employe(String firstName, String lastName, int age){
        this(firstName, lastName, age, 1000.0);
    }
    public Employe(String firstName, String lastName){
        this(firstName, lastName, 25, 1000.0);
    }
    public void setAge(int age){
        if (age > 0){
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }
    public void setSalary(){
        if (salary > 0){
            this.salary = salary;
        }
    }
    public double getSalary(){
        return salary;
    }
    public void setFirstName(){
        if (firstName != null) {
            this.firstName = firstName;
        }
    }
    public void setLastName(){
        if (lastName != null) {
            this.lastName = lastName;
        }
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }
    public String toString(){
        return "Сотрудник: " + getFullName() + " Возраст: " + getAge() + " Зарплата: " + getSalary();
    }
    @Override
    public boolean equals(Object anotherObject) {
        if (anotherObject == null) {
            return false;
        }
        if (!(anotherObject instanceof Employe)) {
            return false;
        }

        Employe anotherEmployee = (Employe) anotherObject;
        return firstName.equals(anotherEmployee.firstName) && lastName.equals(anotherEmployee.lastName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

}