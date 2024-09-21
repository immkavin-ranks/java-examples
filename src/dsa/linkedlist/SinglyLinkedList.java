package dsa.linkedlist;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void createSinglyLinkedList(int nodeValue) {
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;

        head = node;
        tail = node;

        size = 1;
    }
}
