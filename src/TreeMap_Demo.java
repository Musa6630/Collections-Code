import java.util.TreeMap;

public class TreeMap_Demo {
    public static void main(String[] args) {
        TreeMap t=new TreeMap();
        t.put(107,"XXX");
        t.put(102,"YYY");
        t.put(103,"ZZZ");
        t.put(104,"420");
//        t.put("VVV","XXX"); Returns Class Cast Exception
//        t.put(null,"XXX"); Returns NUll Pointer Exception
        System.out.println(t);
    }
}
