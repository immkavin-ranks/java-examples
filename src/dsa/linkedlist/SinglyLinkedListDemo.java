package dsa.linkedlist;

public class SinglyLinkedListDemo {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.create(5);
        System.out.println(sLL.head.value);
        sLL.insert(6, 1);
        sLL.insert(7, 0);
        System.out.println(sLL.head.next.value);
        System.out.println(sLL.head.next.next.value);

        sLL.insert(8, 4);
        sLL.traverse();
        sLL.search(6);
        sLL.search(10);
        sLL.deleteNode(3);
        sLL.traverse();
        System.out.println(sLL.tail.value);

        sLL.delete();
        System.out.println(sLL.size);

        sLL.push(10);
        sLL.push(100);
        System.out.println(sLL.pop().value);
        sLL.search(10);
        sLL.traverse();
        System.out.println(sLL.pop().value);


    }
}
