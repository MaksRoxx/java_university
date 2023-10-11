package practice23.task1;

public class Main {
    public static void main(String[] args) {
        Drink drink1 = new Drink("Coffee", "A hot, caffeinated beverage");
        Drink drink2 = new Drink(3, "Tea", "A soothing herbal drink");

        System.out.println("Drink 1 Name: " + drink1.getName());
        System.out.println("Drink 1 Cost: " + drink1.getCost());
        System.out.println("Drink 1 Description: " + drink1.getDescription());

        System.out.println("Drink 2 Name: " + drink2.getName());
        System.out.println("Drink 2 Cost: " + drink2.getCost());
        System.out.println("Drink 2 Description: " + drink2.getDescription());
    }
}