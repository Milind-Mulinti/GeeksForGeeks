package learning.linkedList;

public class TraversingLL {
    public static void print(Node head){

        if(head == null)
            return;

        Node current = head;
        while(current.next !=null){

            System.out.print(current.data);
            current = current.next;
        }

        System.out.print(current.data);
    }

    public static void recursiveMethod(Node head){
        System.out.print("In recursiveMethod");
        if(head == null)
            return;
        System.out.print(head.data);
        recursiveMethod(head.next);

    }
}
