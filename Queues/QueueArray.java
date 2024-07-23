package Queues;

public class QueueArray {
    private Animal[] arr;
    private int backOfQueue;
    private int nItems;
    int beginningOfQueue;

    public QueueArray(int size) {
        this.arr = new Animal[size];
        this.backOfQueue = -1;
        this.beginningOfQueue = -1;
        this.nItems = 0;
        System.out.println("The Queue is successfully created with size of: " + size);
    }

    // isFull
    public boolean isFull() {
        return backOfQueue == arr.length - 1;
    }

    // isEmpty
    public boolean isEmpty() {
        return nItems == 0;
    }

    // Enqueue
    public void enQueue(Animal value) {
        if (isFull()) {
            System.out.println("The Queue is Full");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            backOfQueue++;
            nItems++;
            arr[backOfQueue] = value;
            System.out.println("Successfully inserted " + value.getType() + " in the queue");
        } else {
            backOfQueue++;
            nItems++;
            arr[backOfQueue] = value;
            System.out.println("Successfully inserted " + value.getType() + " in the queue");
        }
    }

    // Dequeue
    public Animal deQueue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return null;
        } else {
            Animal result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > backOfQueue) {
                beginningOfQueue = backOfQueue = -1;
            }
            nItems--;
            return result;
        }
    }

    // Peek
    public Animal peek() {
        if (!isEmpty()) {
            return arr[beginningOfQueue];
        } else {
            System.out.println("The Queue is empty");
            return null;
        }
    }

    // Delete
    public void deleteQueue() {
        arr = null;
        System.out.println("The queue is successfully deleted");
    }
}
