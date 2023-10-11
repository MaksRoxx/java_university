package practice23.task3;

public class Main {
    public static void main(String[] args) {
        Dish spaghetti = new Dish("Spaghetti", "Delicious pasta with tomato sauce", 10);
        Drink coffee = new Drink("Coffee", "A hot, caffeinated beverage", 3);
        Dish salad = new Dish("Salad", "Fresh mixed greens with vinaigrette dressing", 5);

        Item[] items = {spaghetti, coffee, salad};

        InternetOrder order = new InternetOrder(items);

        System.out.println("Order Total Cost: $" + order.getTotalCost());
        System.out.println("Total Items: " + order.getOrderSize());
        System.out.println("Item Quantity of Coffee: " + order.getItemQuantity("Coffee"));

        Item[] sortedItems = order.getSortedItemsByCostDesc();
        System.out.println("Items Sorted by Cost (Descending):");
        for (Item item : sortedItems) {
            System.out.println(item.getName() + " - $" + item.getCost());
        }
    }
}
