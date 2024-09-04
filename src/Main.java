import java.util.LinkedList;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Queue   =  FIFO data structure
        // A collection designed for holding elementd prior to processing
        //Linear data structure

        //add   =    enqueue, offer()
        //remove   =  dequeue, poll()

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        queue.poll();


        //System.out.println(queue.peek());
        System.out.println(queue);



    }
}