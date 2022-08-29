import java.util.HashMap;
import java.util.WeakHashMap;

public class Weak_HashMap {
    static class Temp
    {
        public String toString()
        {
            return "Temp";
        }
        public void finalize()
        {
            System.out.println("finalize method called");
        }
    }

    public static void main(String[] args) throws Exception {
//        HashMap m=new HashMap();
        WeakHashMap m= new WeakHashMap();
        Temp t=new Temp();
        m.put(t,"durga");
        System.out.println(m);
        t=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(m);
    }
}
