package learning.linkedList;

public class LinkedListCreation {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        //TraversingLL.recursiveMethod(head);
       // Node newHead=Insertion.beginInsert(head,5);
       // System.out.print(newHead.data);
       // Insertion.endInsert(head,90);

        SearchOperation.searchPosition(head,40);
    }
}
