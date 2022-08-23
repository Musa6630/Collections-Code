import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

public class Customised_default_sorting {
    static class Employee implements Comparable
    {
        String name;
        int eid;
        Employee(String name,int eid)
        {
            this.name=name;
            this.eid=eid;
        }
        public String toString()
        {
            return name + "--"+eid;
        }
        public int compareTo(Object obj)
        {
            int eid1=this.eid;
            Employee e=(Employee) obj;
            int eid2=e.eid;
            if (eid2<eid1)
            {
                return -1;
            }
            else if (eid2>eid1)
            {
                return 1;
            }
            else
                return 0;
        }
    }
//for ordering in alphabetical order of name in descending order.
    static class myComparator implements Comparator
    {
        public int compare(Object obj1,Object obj2)
        {
            Employee e1=(Employee) obj1;
            Employee e2=(Employee) obj2;

            String s1=e1.name;
            String s2=e2.name;
            return s1.compareTo(s2);

        }
    }
    public static void main(String[] args) {
        Employee e1=new Employee("nag",100);
        Employee e2=new Employee("balaiah",200);
        Employee e3=new Employee("chiru",50);
        Employee e4=new Employee("venki",150);
        Employee e5=new Employee("nag",100);

        TreeSet t=new TreeSet();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
        System.out.println(t);

        TreeSet t1=new TreeSet(new myComparator());
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        System.out.println(t1);

    }
}
