import java.util.Comparator;
import java.util.TreeSet;

public class StringBuffer_sorting {
    static class Mycomparator implements Comparator
    {
        public int compare(Object obj1,Object obj2)
        {
            String s1=obj1.toString();
            String s2=obj2.toString();
            return -s1.compareTo(s2);
//            return s2.compareTo(s1);
        }
    }
    public static void main(String[] args) {
        TreeSet t=new TreeSet(new Mycomparator());
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Q"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("K"));
        t.add(new StringBuffer("L"));
        System.out.println(t);
    }
}
