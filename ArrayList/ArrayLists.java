package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(20, 10, 72));
        System.out.println(numbers);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(14);
        numbers.add(28);
        numbers.add(56);
        System.out.println(numbers);

        numbers.trimToSize();

        //iterating over elements

        for (int i = 0; i < numbers.size(); i++) {
            int element = numbers.get(i);
            System.out.println(element);
        }
        

        //iterating using enhanced

        for(int item : numbers) {
            System.out.println(item);
        }

        numbers.stream().forEach(x -> System.out.println(x));

        ArrayList<String> namesOfStudents = new ArrayList<>(Arrays.asList("Scott", "Justin", "Raymond", "Lauren"));
        namesOfStudents.stream().forEach(names -> {
            String namesInCaps = names.toUpperCase();
            System.out.println(namesInCaps);
        });


        //iterator traversal
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            int el = it.next();
            System.out.println(el);
        }


        //removing an element
        numbers.remove(8);//will remove number at index 8 (56)
        numbers.remove(5);//will remove number at index 5 (7)
        System.out.println(numbers);
    }
}