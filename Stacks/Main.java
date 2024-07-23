package Stacks;

public class Main {
    public static void main(String[] args) {
        // Test StackArrays
        StackArrays stackArrays = new StackArrays(5);
        stackArrays.push(1);
        stackArrays.push(2);
        stackArrays.push(3);
        stackArrays.isEmpty();
        stackArrays.isFull();
        stackArrays.pop();
        stackArrays.peek();
        stackArrays.deleteStack();

        // test StackLinkedList
        StackLinkedList stackLinkedList = new StackLinkedList();
        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);
        stackLinkedList.isEmpty();
        stackLinkedList.pop();
        stackLinkedList.peek();
        stackLinkedList.deleteStack();

        // test palindrome check
        String word = "level";
        System.out.println("Is " + word + " a palindrome? " + StackArrays.isPalindrome(word));
    }
}
