public class LinkedList<T> {
    private Node<T> head;
    private int size;

    // constructor
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }


    // addFirst value
    public void addFirst(T data) {
        Node<T> newNode = new Node<T>(data);
        if(head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // addLast value
    public void add(T data){
        Node<T> newNode = new Node<T>(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node<T> current = this.head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    //add a whole node
    public void add(Node<T> node){
        if(head == null) {
            head = node;
        } else {
            Node<T> current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        size++;
    }

    // remove first node
    public void removeFirst() {
        if (size == 1) {
            head = null;
        } else {
            head = head.next;
        }
        size --;
    }
    //remove last node
    public void removeLast() {
        if (size == 1) {
            head = null;
        } else {
            Node<T> current = head;
            while(current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        size --;
    }

    // find data by Index
    public int indexOf(T target) {
        if (head == null) {
            return -1;
        } else {
            int index = 0;
            int res = -1;
            Node<T> current = head;
            while(current != null) {
                if(current.data == target) {
                    res = index;
                }
                current = current.next;
                index ++;
            }
            return res;
        }
    } 

    //add node at index
    public void addAt(T data, int index) {
        Node<T> newNode = new Node<T>(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else if (index >= size) {
            add(data);
        } else {
            int i = 0;
            Node<T> current = head;
            while(current.next != null) {
                if (i + 1 == index) {
                    newNode.next = current.next;
                    current.next = newNode;
                    size ++;
                }
                current = current.next; 
                i++;
            }
        }
    }




    // get size
    public int size() {
        return this.size;
    }


    // toString()
    public String toString() {
        if (head == null) {
            return "[]";
        }
        String res = "[" + head.data;

        Node<T> current = head.next;
        while (current != null) {
            res += ", " + current.data;
            current = current.next;
        }
        return res + "]";

    }
    

}
