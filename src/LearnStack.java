import java.util.Stack;

public class LearnStack {

    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);

        System.out.println(animals.peek());//peek()= top

        animals.pop();

        System.out.println("Stack: " + animals);

        System.out.println(animals.peek());

        Stack<Long> numbers= new Stack<>();
        numbers.push(121333L);
        numbers.push(122331L);
        numbers.push(1L);
        numbers.push(121545L);

        System.out.println("stack" + numbers);

        System.out.println(numbers.push(1212121L));
        System.out.println("stack" + numbers);
        System.out.println("At top "+numbers.peek());

        numbers.pop();
        System.out.println("after pop "+ numbers);

    }
}
