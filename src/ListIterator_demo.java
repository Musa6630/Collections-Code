import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator_demo {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add("Bala Krishna");
        l.add("Venki");
        l.add("Chiru");
        l.add("Nag");
        System.out.println(l);

        ListIterator ltr=l.listIterator();
        while (ltr.hasNext())
        {
            String s=(String) ltr.next();
            if (s.equals("Venki"))
            {
                ltr.remove();
            }
            else if (s.equals("Nag"))
            {
                ltr.add("Chaitu");
            }
            else if (s.equals("Chiru"))
            {
                ltr.set("Musabbir");
            }
            System.out.println(l);

        }
        System.out.println(l);
    }
}
