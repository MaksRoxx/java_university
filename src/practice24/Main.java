package practice24;

public class Main {
    public static void main(String[] args) {
        Drink drink1 = new Drink(5, "Cola", "Refreshing cola drink", 0.0, DrinkTypeEnum.SODA);
        Dish dish1 = new Dish(10, "Burger", "Delicious burger with cheese");

        TableOrder tableOrder1 = new TableOrder();

        tableOrder1.add(dish1);
        tableOrder1.add(drink1);

        System.out.println("Table Order:");
        printOrderInfo(tableOrder1);

        String itemToRemove = "Cola";
        tableOrder1.remove(itemToRemove);

        System.out.println("Table Order after removing " + itemToRemove + ":");
        printOrderInfo(tableOrder1);
    }

    public static void printOrderInfo(Order order) {
        System.out.println("Order Items:");
        for (MenuItem item : order.getItems()) {
            System.out.println(item.getName() + " - " + item.getCost());
        }
        System.out.println("Total Cost: " + order.costTotal());
        System.out.println("Items Quantity: " + order.itemsQuantity());
        System.out.println("Customer: " + order.getCustomer().getFirstName());
        System.out.println();
    }
}
