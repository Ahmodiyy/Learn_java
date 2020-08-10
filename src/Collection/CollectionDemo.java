package Collection;

import javax.smartcardio.*;
import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        CollectionDemo collections = new CollectionDemo();
        //collections.list();
        //collections.set();
        //collections.queue();
        //collections.deque();
        //collections.map();
        collections.mapToValue();
    }

    List list(){
        System.out.println("-----------------------list----------------------");
        List<String> list = new ArrayList<>();
        list.add("zhmod");
        list.add("john");
        //Collections.shuffle(list, new Random());

        // non natural ordering
        list.sort((o1, o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            System.out.println("int " + o1.compareTo(o2));
            return o1.compareTo(o2);
        });
        System.out.println("list:" + list);
        return list;
    }

    Set set (){
        Set<String> set = new HashSet<>();
        set.add("ahmod");
        set.add("ahmod");
        set.add("john");
        set.add("bola");
        System.out.println("set: " + set);
        return set;
    }

    Queue queue (){
        Queue<String> queue = new LinkedList<>();
        queue.add("ahmod");
        queue.add("john");
        queue.add("bola");
        queue.offer("zain");
        System.out.println(queue.poll());
        queue.poll();
        System.out.println(queue.peek());
        System.out.println("set: " + queue);
        return queue;
    }

    Deque deque(){
        Deque<String> deque = new ArrayDeque<>();
        deque.add("john");
        deque.add("bola");
        deque.offer("zain");
        deque.pollLast();
        deque.offerFirst("ahmod");
        System.out.println("deque: " + deque);
        return deque;
    }

    Map map(){
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "Don");
        map.put(1, "Zain");
        Collection<String> keys = map.values();
        List<String> valueList = new ArrayList<>(keys);
        Collections.sort(valueList);
        System.out.println("keyList: " + valueList);
        System.out.println("map: " + map);
        return map;
    }
     void mapToValue(){
         Map<Integer, String> map = new HashMap<>();
         map.put(2, "a");
         map.put(1, "b");
         System.out.println(map);
     }
}
