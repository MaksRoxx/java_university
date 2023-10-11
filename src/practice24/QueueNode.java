package practice24;

public class QueueNode {
    Order value;
    QueueNode prev;
    QueueNode next;

    public QueueNode(Order value) {
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}