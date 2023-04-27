public class Node {
    public int data;
    public Node prev;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }



    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtBeginning(5);
        list.insertAtBeginning(10);
        list.insertAtEnd(15);
        list.insertAtEnd(20);

        list.printList();

//        System.out.println(" After deleting 15: ");
//        list.delete(15);
//        list.printList();
        System.out.println("\n After reverse: ");
        list.reverse();
        list.printList();
    }

}