import java.util.Enumeration;
import java.util.Vector;

public class Enumerationdemo2 {
    public static void main(String[] args) {
        Vector V=new Vector();
        for (int i=0; i<=10; i++)
        {
            V.addElement(i);
        }
        System.out.println(V);
        Enumeration E=V.elements();
        while (E.hasMoreElements()) {
            Integer I = (Integer) E.nextElement();
            if (I % 2 == 0)
                System.out.println(I);
        }
        System.out.println(V);
    }
}
