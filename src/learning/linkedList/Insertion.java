package learning.linkedList;

public class Insertion {

    static Node beginInsert(Node head , int x){

        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        return head;
    }

    static void endInsert(Node head , int x){

        Node temp = new Node(x);
        Node current = head;
        while(current.next != null){

            current = current.next;

        }
        current.next = temp;
        temp.next = null;
        TraversingLL.print(head);
    }
}
