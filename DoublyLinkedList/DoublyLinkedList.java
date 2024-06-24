package DoublyLinkedList;

public class DoublyLinkedList {
    private DoublyNode head;

    public DoublyLinkedList() {
        this.head = null;
    }

    // Method to add a node at the end
    public void addNode(int value) {
        DoublyNode newNode = new DoublyNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        DoublyNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    // Reverse traverse
    public void reverseTraverse() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        DoublyNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.prev;
        }
        System.out.println();
    }

    // Search for a value
    public boolean search(int value) {
        DoublyNode current = head;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Delete a node (consider all 3 cases)
    public void deleteNode(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        DoublyNode current = head;

        // Case 1: Deleting the head node
        if (current != null && current.value == value) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            }
            System.out.println("Node deleted: " + value);
            return;
        }

        // Case 2: Deleting a node in the middle or end
        while (current != null && current.value != value) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node not found: " + value);
            return;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        }

        System.out.println("Node deleted: " + value);
    }

    // Delete entire DLL
    public void deleteEntireList() {
        DoublyNode current = head;
        while (current != null) {
            DoublyNode next = current.next;
            current.prev = null;
            current.next = null;
            current = next;
        }
        head = null;
        System.out.println("Entire list deleted.");
    }

    // Display the list
    public void display() {
        DoublyNode current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addNode(1);
        dll.addNode(2);
        dll.addNode(3);
        dll.addNode(4);
        dll.addNode(5);

        System.out.println("Original List:");
        dll.display();

        System.out.println("Reversed List:");
        dll.reverseTraverse();

        System.out.println("Search for value 3: " + dll.search(3));
        System.out.println("Search for value 6: " + dll.search(6));

        dll.deleteNode(3);
        System.out.println("List after deleting 3:");
        dll.display();

        dll.deleteNode(1);
        System.out.println("List after deleting 1 (head):");
        dll.display();

        dll.deleteNode(5);
        System.out.println("List after deleting 5 (tail):");
        dll.display();

        dll.deleteEntireList();
        dll.display();
    }
}
