import java.util.HashMap;

public class Identity_Hashmap {
    public static void main(String[] args) {
        HashMap m=new HashMap();
        Integer i1=new Integer(10);
        Integer i2=new Integer(10);
        m.put(i1,"kalyan");
        m.put(i2,"pawan");
        System.out.println(m);

        /*If we replace Hashmap with Identityhashmap then i1 and i2 are not duplicate keys because
         i1==i2 returns false.In this case output is{10=pawan,10=kalyan */
    }
}
