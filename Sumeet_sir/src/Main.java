
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("one");
        queue.remove();
        queue.remove();
        System.out.println(queue);
    }
}
