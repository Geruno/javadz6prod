package javadz6proj;

public class Main {
    public static void main(String[] args) {
        Employe emp1 = new Employe("Serg", "Fork", 33);
        Employe emp2 = new Employe("Stepan", "Turmin");
        Employe emp3 = new Employe("Mihail", "Mitson", 32, 15000);
        Employe emp4 = new Employe("Semen", "Petrov", 0);
        System.out.println(emp1.toString());
        System.out.println();
        System.out.println(emp2.toString());
        System.out.println();
        System.out.println(emp3.toString());
        System.out.println();
        System.out.println(emp4.toString());
        System.out.println();
        System.out.println(emp2.equals(emp1));
        System.out.println(emp3.equals(emp3));
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());
        System.out.println(emp3.hashCode());
        System.out.println(emp4.hashCode());
        System.out.println();
    }
}