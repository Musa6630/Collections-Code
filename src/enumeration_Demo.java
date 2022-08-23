import java.util.Enumeration;
import java.util.Vector;

public class enumeration_Demo {
    public static void main(String[] args) {
        Vector V=new Vector();
        for (int i=0; i<=10; i++)
        {
            V.addElement(i);
        }
        System.out.println(V);
        Enumeration E=V.elements();
        while (E.hasMoreElements())
        {
            Integer I=(Integer) E.nextElement();
            if (I%2==0)
                System.out.println(I);
            else {
                System.out.println(I +" is removed");
                V.remove(I);
                System.out.println(V);
            }


        }
    }
}
