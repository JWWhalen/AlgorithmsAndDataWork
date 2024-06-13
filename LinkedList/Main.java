package LinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertInLinkedList(1, 0);
        singleLinkedList.insertInLinkedList(2, 1);
        singleLinkedList.insertInLinkedList(3, 2);
        singleLinkedList.insertInLinkedList(4, 3);
        singleLinkedList.insertInLinkedList(5, 1);
        singleLinkedList.traverseLinkedList();
        singleLinkedList.searchNode(4);
    }
}


//Assignment question number
//1. Uncomment line 10 "singleLinkedList.insertInLinkedList(5, 1)" and Investigate and fix
// why when inserting a value at a position that is already occupied, it throws a null pointer exception.

// The error was in the InserInLinkedList method, Node nextNode = node; node.next = nextNode creates a
// circilar reference where the new node keepts pointing to itself

// Node nextNode = tempNope.next gets the existing node
// tempNode.next = node points tempNode to the new node
// node.next = nextNode points new node to the next node
