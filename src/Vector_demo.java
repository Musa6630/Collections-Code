import java.util.Vector;

public class Vector_demo {
    public static void main(String[] args) {
        Vector V= new Vector();
        for (int i=1; i<=10; i++)
        {
            V.add(i);
        }
        System.out.println(V.capacity());
        V.add("A");
        System.out.println(V.capacity());
        System.out.println(V);
    }
}
