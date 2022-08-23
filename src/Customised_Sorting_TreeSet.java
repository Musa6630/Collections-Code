import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

public class Customised_Sorting_TreeSet {
    public static class Mycomparator implements Comparator
    {
        public int compare(Object obj1,Object obj2)
        {
            String s1=(String) obj1;
            String s2=obj2.toString();
            //return -s1.compareTo(s2);
            return s2.compareTo(s1);
        }
    }

    public static void main(String[] args) {
        TreeSet t=new TreeSet(new Mycomparator());
        t.add("Raja");
        t.add("Shobha rani");
        t.add("Raja Kumari");
        t.add("ganga");
        t.add("Rama");
        System.out.println(t);
    }
}
