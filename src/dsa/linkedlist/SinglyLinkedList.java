package dsa.linkedlist;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;
    public void create(int nodeValue) {
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;

        head = node;
        tail = node;

        size = 1;
    }
    public void insert(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            create(nodeValue);
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public void traverse() {
        if (head == null) return;
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
            if (i < size - 1) {
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println();
    }

    public void search(int nodeValue) {
        if (head == null) return;
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            if (tempNode.value == nodeValue) {
                System.out.println("Found the node at location, i = " + i);
                return;
            }
            tempNode = tempNode.next;
        }
        System.out.println("Node not found!");
    }

    public void deleteNode(int location) {
        if (head == null) return;
        if (location == 0) {
            head = head.next;
            size--;
            // if deletion in singly linked list with only one node
            if (size == 0) tail = null;
        } else if (location >= size - 1) {
            Node tempNode = head;
            for (int i = 0; i < size - 2; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head = tail = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;

        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    public void delete() {
        head = tail = null;
        size = 0;
    }

    public void push(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;

        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    public Node pop() {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }
        Node lastNode;
        if (head == tail) {
            lastNode = head;
            head = tail = null;
        } else {
            Node tempNode = head;
            while (tempNode.next != tail) {
                tempNode = tempNode.next;
            }

            lastNode = tempNode.next;
            tempNode.next = null;
            tail = tempNode;
        }

        size--;
        return lastNode;
    }

}
