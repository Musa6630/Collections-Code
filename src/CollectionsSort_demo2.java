import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSort_demo2 {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add("A");
        l.add("Q");
        l.add("Z");
        l.add("G");
        l.add("B");
        System.out.println("Before Sorting" +l);
        Collections.sort(l,new MyComparator());
        System.out.println("After Sorting " + l);
    }
    static class MyComparator implements Comparator
    {
        public int compare(Object obj1,Object obj2)
        {
            String s1=obj1.toString();
            String s2=obj2.toString();
            return s2.compareTo(s1);
        }
    }
}
