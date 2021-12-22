package src;
/* Nam (Logan) Nguyen
    2021 @ SUNY Oswego */

public class LinkedListClient {
    public static void main(String[] args) {
        LinkedList<Integer> s = new LinkedList<>();

        // test add()
        s.add(12);
        s.add(2);
        s.add(45);
        // s.add(new Node<Integer>(12));
        // s.add(new Node<Integer>(24));
        // s.add(new Node<Integer>(32));
        // s.add(new Node<Integer>(3));


        //test addFirst()
        s.addFirst(33);
        s.addFirst(1);
        System.out.println("original: " + s.toString());


        //test removeFirst
        // s.removeFirst();

        //test removeLast()
        // s.removeLast();
        // System.out.println("new: " +s.toString());

        //test indexOf()
        // System.out.println(s.indexOf(45));

        //test addAt()
        s.addAt(2, 100);
        System.out.println("new: " +s.toString());

        



        //test .size()
        System.out.println("size: " +s.size());


    }
}
