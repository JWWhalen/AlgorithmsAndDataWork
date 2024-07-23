package Queues;

public class ShelterQueue {
    private QueueArray dogs;
    private QueueArray cats;
    private int timeStamp;

    public ShelterQueue(int size) {
        dogs = new QueueArray(size);
        cats = new QueueArray(size);
        timeStamp = 0;
    }

    // enqueue a new animal
    public void enqueue(String type) {
        Animal animal = new Animal(type, timeStamp);
        timeStamp++;

        if (type.equals("dog")) {
            dogs.enQueue(animal);
        } else if (type.equals("cat")) {
            cats.enQueue(animal);
        } else {
            throw new IllegalArgumentException("Unknown animal type");
        }

        System.out.println("Successfully added a " + type);
    }

    // dequee any animal
    public Animal dequeueAny() {
        if (dogs.isEmpty() && cats.isEmpty()) {
            System.out.println("No animals available for adoption");
            return null;
        }

        if (dogs.isEmpty()) {
            return dequeueCat();
        }

        if (cats.isEmpty()) {
            return dequeueDog();
        }

        Animal oldestDog = dogs.peek();
        Animal oldestCat = cats.peek();

        if (oldestDog.getArrivalTime() < oldestCat.getArrivalTime()) {
            return dequeueDog();
        } else {
            return dequeueCat();
        }
    }

    // dequeue a dog
    public Animal dequeueDog() {
        if (dogs.isEmpty()) {
            System.out.println("No dogs available for adoption");
            return null;
        }
        return dogs.deQueue();
    }

    // dqueue a cat
    public Animal dequeueCat() {
        if (cats.isEmpty()) {
            System.out.println("No cats available for adoption");
            return null;
        }
        return cats.deQueue();
    }

    // check if shelter is empty
    public boolean isEmpty() {
        return dogs.isEmpty() && cats.isEmpty();
    }
}
