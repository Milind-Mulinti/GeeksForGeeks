package learning.stack;

public class ArrayStackImplementation {
    int arr[];
    int capacity;
    int top;

    ArrayStackImplementation(int capacity){
        this.capacity = capacity;
        top =-1;
        arr = new int[capacity];
    }

    void push(int value){
        top++;
        arr[top] = value;
    }

    int pop(){
        int res = arr[top];
        top--;
        System.out.print("value has been poped out : ");
        return res;
    }
    int size(){
        return  top+1;
    }
    boolean isEmpty(){
        return (top == -1);
    }

    public static void main(String[] args) {
        ArrayStackImplementation st = new ArrayStackImplementation(5);
        st.push(10);
        st.push(20);
        System.out.println(st.isEmpty());
        System.out.println(st.size()) ;
        System.out.println(st.pop()) ;
        System.out.println(st.size()) ;
        System.out.println(st.pop()) ;
        System.out.println(st.isEmpty());
        System.out.println(st.size()) ;
    }
}
