package practice23.task2;

public class Main {
    public static void main(String[] args) {
        Dish spaghetti = new Dish(10, "Spaghetti", "Delicious pasta with tomato sauce");
        Drink coffee = new Drink(3, "Coffee", "A hot, caffeinated beverage");
        Dish salad = new Dish(5, "Salad", "Fresh mixed greens with vinaigrette dressing");

        Order order1 = new Order();
        order1.addItem(spaghetti);
        order1.addItem(coffee);

        Order order2 = new Order();
        order2.addItem(salad);
        order2.addItem(coffee);

        TablesOrderManager orderManager = new TablesOrderManager();
        orderManager.placeOrder(order1);
        orderManager.placeOrder(order2);

        System.out.println("Order 1 Total Cost: $" + order1.getTotalCost());
        System.out.println("Order 2 Total Cost: $" + order2.getTotalCost());
    }
}
