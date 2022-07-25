import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);///enter an element we use *offer in queue//we used *add instud of offer but it is dangerous function because it through an exception that clashesh the program.
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        System.out.println(queue.poll());//to remove an element from queue we use *poll//we used *remove instud of offer but it is dangerous function because it through an exception that clashesh the program.

        System.out.println(queue);

        System.out.println(queue.peek());//to get the top value we used *peek just like in list interface//we used add instud of *element but it is dangerous function because it through an exception that clashesh the program.

    }
}
