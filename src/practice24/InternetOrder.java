package practice24;

public class InternetOrder {
    private ListNode head;
    private int size;

    public InternetOrder() {
        this.head = new ListNode(null);
        this.size = 0;
    }

    public InternetOrder(Order order) {
        this.head = new ListNode(order);
        this.size = 1;
    }

    public Order remove(String itemToRemove) {
        if (size == 0) {
            return null;
        }
        Order removedOrder = head.getOrder();
        head = head.getNext();
        size--;
        return removedOrder;
    }

    public Order order() {
        return head.getOrder();
    }

    public int size() {
        return size;
    }

    public int itemsQuantity() {
        int totalQuantity = 0;
        ListNode current = head;
        while (current != null) {
            totalQuantity += current.getOrder().itemsQuantity();
            current = current.getNext();
        }
        return totalQuantity;
    }

    public double costTotal() {
        double totalCost = 0;
        ListNode current = head;
        while (current != null) {
            totalCost += current.getOrder().costTotal();
            current = current.getNext();
        }
        return totalCost;
    }

    public int ordersQuantity() {
        return size;
    }

    public int itemQuantity(String itemName) {
        int totalQuantity = 0;
        ListNode current = head;
        while (current != null) {
            totalQuantity += current.getOrder().itemQuantity(itemName);
            current = current.getNext();
        }
        return totalQuantity;
    }

    public int itemQuantity(MenuItem item) {
        int totalQuantity = 0;
        ListNode current = head;
        while (current != null) {
            totalQuantity += current.getOrder().itemQuantity(item);
            current = current.getNext();
        }
        return totalQuantity;
    }
}
