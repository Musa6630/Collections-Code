import jdk.swing.interop.SwingInterOpUtils;

import java.util.Hashtable;

public class Hashtable_demo3 {
    public static void main(String[] args) {
        class Temp
        {
            int i;
            Temp(int i)
            {
                this.i=i;
            }
            public int hashCode()
            {
                return i;
            }
            public String toString()
            {
                return i+" ";
            }
        }
        Hashtable h=new Hashtable(25);
        h.put(new Temp(5),"A");
        h.put(new Temp(2),"B");
        h.put(new Temp(6),"C");
        h.put(new Temp(15),"D");
        h.put(new Temp(23),"E");
        h.put(new Temp(16),"F");
        System.out.println(h);
    }
}
