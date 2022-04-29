public class Node {
    Object value;
    Node next;
    Node previous;

    public Node(Object val, Node next,Node previous) {
        this.next = next;
        this.value = val;
        this.previous = previous;
    }
}
