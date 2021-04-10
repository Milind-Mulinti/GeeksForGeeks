package learning.linkedList;

public class SearchOperation {

    public static int searchPosition(Node head , int key){

        Node temp = head ;
        int count =0;
        while(temp.data != key){
            temp = temp.next;
            count++;
        }
        System.out.print(count +1);
        return (1+count);
    }
}
