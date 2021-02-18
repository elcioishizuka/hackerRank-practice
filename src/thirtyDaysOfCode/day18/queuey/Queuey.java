package thirtyDaysOfCode.day18.queuey;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queuey {

    LinkedList queue;

    // Making a queue instance
    public Queuey(){
        queue = new LinkedList();
    }

    // Is our queue empty?
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    // What is the size of our queue?
    public int size(){
        return queue.size();
    }

    // Enqueueing an item
    public void enqueue(int n){
        queue.addLast(n);
    }

    // Dequeueing an item
    public int dequeue(){
        return (int) queue.remove(0);
    }

    // Peek at the first item
    public int peek(){
        return (int) queue.get(0);
    }

    public static void main(String[] args) {
        Queuey numberQueue = new Queuey();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);
        System.out.println("First out: " + numberQueue.dequeue());
        System.out.println("Peek at second item: " + numberQueue.peek());
        System.out.println("Second out: " + numberQueue.dequeue());
        System.out.println("Third out: " + numberQueue.dequeue());

        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.add("hi");
        stringQueue.add("there");
        System.out.print(stringQueue.poll() + " ");
        System.out.print(stringQueue.poll() + "!\n");

        Stack<String> stringStack = new Stack<>();
        stringStack.push("there");
        stringStack.push("hi");
        System.out.print(stringStack.pop() + " ");
        System.out.print(stringStack.pop() + "!\n");




    }

}
