import java.util.LinkedList;

public class LinkedList_demo {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add("durga");
        l.add(29);
        l.add(null);
        l.add("durga");
        System.out.println(l);
        l.set(0,"software");
        System.out.println(l);
        l.add(0,"venky");
        System.out.println(l);
        l.removeLast();
        l.addFirst("CCC");
        System.out.println(l);
    }
}
