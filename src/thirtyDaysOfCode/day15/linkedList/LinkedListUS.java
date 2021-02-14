package thirtyDaysOfCode.day15.linkedList;

import java.util.LinkedList;

public class LinkedListUS {

    // Properties
    Node head;
    int count;

    // Constructors
    // TODO - enable this constructor when the other TODOs were addressed
//    public LinkedList(){
//        head = null;
//        count = 0;
//    }

    public LinkedListUS(Node newHead) {
        head = newHead;
        count = 1;
    }

    // Methods

    // add
    // TODO - address the scenario about adding a new Node where the current Node is empty
    public void add(int newData){
        Node temp = new Node(newData);
        Node current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(temp);
        count++;

    }

    // get
    public int get(int index){
        if(index <= 0){
            return -1;
        }
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    // size
    public int size(){
        return count;
    }

    // isEmpty
    public boolean isEmpty(){
        return head == null;
    }

    // remove
    // TODO - address the scenario where the linked list is shorter than 3
    public void remove(){
        // remove from the back of the list
        Node current = head;
        while (current.getNext().getNext() != null){
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

    }


}
