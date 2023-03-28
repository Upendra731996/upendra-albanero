import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionQueue {

    public static void main(String[] args) {
        Queue q=new PriorityQueue();

        for (int i=0 ;i<10; i++){
            q.add(i+4);
        }
        System.out.println(q);


    }
}
