package practice23.task2;

import java.util.ArrayList;
import java.util.List;

class TablesOrderManager {
    private List<Order> orders = new ArrayList<>();

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }
}