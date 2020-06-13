import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class NewDeque {
    // job:用 add first 或 add last 这套新的 API 改写 Deque 的代码
    public static void main(String[] args) {
        newInvoke();
        // oldInvoke();
    }

    public static void oldInvoke(){
        Deque<String> deque = new LinkedList();
        deque.push("a");
        deque.push("b");
        deque.push("c");
        System.out.println(deque);

        String str = deque.peek();
        System.out.println(str);
        System.out.println(deque);

        while(deque.size() > 0){
            System.out.println(deque.pop());
        }
        System.out.println(deque);
    }

    public static void newInvoke(){
        Deque<String> deque = new LinkedList();
        deque.addFirst("c");
        deque.addFirst("b");
        deque.addFirst("a");
        System.out.println(deque);

        deque.addLast("d");
        deque.addLast("e");
        deque.addLast("f");
        System.out.println(deque);
    }
}