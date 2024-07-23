package Stacks;

class Node {
    int value;
    Node next;
}

public class StackLinkedList {
    Node top;

    public StackLinkedList() {
        this.top = null;
        System.out.println("The stack is created");
    }

    // checka if it is empty
    public boolean isEmpty() {
        if (top == null) {
            System.out.println("Stack is empty");
            return true;
        } else {
            System.out.println("Stack is not empty");
            return false;
        }
    }

    //implement push method
    public void push(int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = top;
        top = newNode;
        System.out.println("The value " + value + " is successfully inserted");
    }

    // implement pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        } else {
            int poppedValue = top.value;
            top = top.next;
            System.out.println("The value " + poppedValue + " is successfully removed");
            return poppedValue;
        }
    }

    //implement peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        } else {
            System.out.println("Top of stack is: " + top.value);
            return top.value;
        }
    }

    //implement deleteStack method
    public void deleteStack() {
        top = null;
        System.out.println("The stack is successfully deleted");
    }
}
