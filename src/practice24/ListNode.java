package practice24;

public class ListNode {
    private Order order;
    private ListNode next;

    public ListNode(Order order) {
        this.order = order;
        this.next = null;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}