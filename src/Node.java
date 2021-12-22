package src;
/* Nam (Logan) Nguyen
    2021 @ SUNY Oswego */

public class Node<T>{
    public T data;
    public Node<T> next;

    // constructor with no param
    public Node() {
        this.data = null;
        this.next = null;
    }

    // constructor with 1 param - data
    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    // constructor with 2 params - data && next
    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }
}