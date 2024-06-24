package Sprint1;

public class TaskList {
    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    public TaskList() {
        this.head = null;
    }

    public void addTask(String description) {
        Task newTask = new Task(description);
        Node newNode = new Node(newTask);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void markTaskAsCompleted(int index) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                current.task.markAsCompleted();
                return;
            }
            count++;
            current = current.next;
        }
        System.out.println("task not found at index: " + index);
    }

    public void printTasks() {
        Node current = head;
        int count = 0;
        while (current != null) {
            System.out.println(count + ": " + current.task);
            count++;
            current = current.next;
        }
    }
}
