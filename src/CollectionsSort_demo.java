import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsSort_demo {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add("Z");
        a.add("A");
        a.add("K");
        a.add("L");
        //a.add(new Integer(10));
//        a.add(null);
        System.out.println("Before sorting: " +a);
        Collections.sort(a);
        System.out.println("After Sorting: " +a);
    }
}
