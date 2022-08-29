import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue_Demo2 {
    public static void main(String[] args) {
        PriorityQueue q=new PriorityQueue(15,new MyComparator());
        q.offer("A");
        q.offer("Z");
        q.offer("L");
        q.offer("B");
        System.out.println(q);
    }

    static class MyComparator implements Comparator
    {
        public int compare(Object obj1,Object obj2)
        {
            String s1=obj1.toString();
            String s2=obj2.toString();
            return s1.compareTo(s2);
        }
    }
}
