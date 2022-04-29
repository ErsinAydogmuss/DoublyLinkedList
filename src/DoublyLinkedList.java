public class DoublyLinkedList {
    Node headNode;

    public DoublyLinkedList() {
        headNode = null;
    }
    public void add(Object val){
        Node newNode = new Node(val,null,null);
        if (headNode == null){
            headNode = newNode;
        }
        else{
            newNode.next = headNode;
            headNode.previous = newNode;
            headNode = newNode;
        }
    }
    public void delete(){
        if (headNode != null) {
            headNode = headNode.next;
            headNode.previous = null;
        }
        else{
            System.out.println("LinkedList boş");
        }
    }

    public void display(){
        Node n = headNode;
        while (n != null){
            System.out.println(n.value);
            n = n.next;
        }
    }
}
