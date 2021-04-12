package learning.linkedList;

public class Loop {
    private Node head;
    Loop(){
        head = null;
    }
    static class Node{
        //data
        int i;
        Node next;
        Node(int i){
            this.i = i;
            this.next = null;
        }
        public void displayData(){
            System.out.println("i= " + i);
        }
    }
    // Method to add nodes to linked list
    public void insertLast(Node newNode){
        if(isEmpty()){
            head = newNode;
        }else{
            Node current = head;
            // traverse to the last of the list
            while(current.next != null){
                current = current.next;
            }
            // adding new node, current last node
            // starts referencing to this new node
            current.next = newNode;
        }
    }
    public boolean isEmpty(){
        return head == null;
    }

    public Node findStartOfLoop(){
        Node slow =head, fast = head;
        boolean flag =false;

        while(slow != null && fast != null && fast.next != null){

            slow = slow.next;
            fast =fast.next.next;

            if(slow == fast){
                flag =true;
                System.out.println("Loop detected at :"+slow.i);
                break;
            }
        }
        if(flag){
            slow =head;
            while (fast.next != null){
                slow =slow.next;
                fast =fast.next;

                if(slow == fast){
                    return  fast;
                }
            }
        }
        return  fast;
    }

    public void removeLoop(Node startNode){
        Node slow =startNode;
        while (slow.next != startNode){
            slow = slow.next;
        }
        slow.next = null;

    }

    // Method to traverse and display all nodes
    public void displayList(){
        Node current = head;
        while(current != null){
            current.displayData();
            current = current.next;
        }
    }
    public static void main(String[] args) {
        Loop list = new Loop();
        Node node = new Node(30);
        list.insertLast(new Node(10));
        list.insertLast(new Node(20));
        list.insertLast(node);
        list.insertLast(new Node(40));
        list.insertLast(new Node(50));
        // same node inserted again to create loop
        list.insertLast(node);

        Node loopStartNode = list.findStartOfLoop();
        System.out.println("Start node of the loop- " + loopStartNode.i);
        list.removeLoop(loopStartNode);
        list.displayList();
    }
}
