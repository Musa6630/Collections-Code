import java.util.Comparator;
import java.util.TreeSet;

//WAP to insert string and stringbuffer object into Treeset where sorting order is in increasing length order
//If two strings are of same legth then consider their alphabetical order.
public class TreeSet_demo2 {
    static class Mycomparator implements Comparator
    {
        public int compare(Object obj1,Object obj2)
        {
            String s1=obj1.toString();
            String s2=obj2.toString();
            int l1=s1.length();
            int l2=s2.length();
            if (l1<l2)
                return -1;
            else if (l1>l2)
                return 1;
            else
                return s1.compareTo(s2);
        }
    }
    public static void main(String[] args) {
        TreeSet t=new TreeSet(new Mycomparator());
        t.add("A");
        t.add(new StringBuffer("ABC"));
        t.add(new StringBuffer("AA"));
        t.add("XX");
        t.add("ABCD");
        t.add("A");
        t.add("ABD");
        System.out.println(t);
    }

}
