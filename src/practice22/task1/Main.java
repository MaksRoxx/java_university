package practice22.task1;

public class Main {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();
        Complex complex1 = factory.createComplex(3, 4);
        Complex complex2 = factory.createComplex();

        System.out.println("Complex 1: " + complex1);
        System.out.println("Complex 2: " + complex2);
    }
}
