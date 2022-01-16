package learning.linkedList;

public class MiddleNode {
    public static Node deleteMiddle(Node head){

        if(head == null || head.next == null) return null;

        Node slow =head ,fast = head;
        Node prev = null;

        while(fast!=null && fast.next!=null){
            prev = slow;
            slow =slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }

    // practice to check knowledge
    public static Node deleteMiddleTest(Node head){

        return null;
    }
    public static void displayList(Node head){
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
       Node newHead =  MiddleNode.deleteMiddle(head);
        MiddleNode.displayList(newHead);


    }
}
