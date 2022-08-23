import java.util.Comparator;
import java.util.TreeSet;

public class Customized_sorting {
    static class MyComparator implements Comparator
    {
        public int compare(Object obj1, Object obj2)
        {
            Integer I1=(Integer) obj1;
            Integer I2=(Integer) obj2;

            //Approach 1
            if ((I1<I2))
                return +1;
            else if (I1>I2)
                return -1;
            else
                return 0;

            //Approach 2
            //It will return in increasing order
           // return I1.compareTo(I2);

            //Approach 3
            //It will return in Decreasing order
            //return -I1.compareTo(I2);
        }
    }

    public static void main(String[] args) {
        TreeSet t=new TreeSet(new MyComparator());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);
        System.out.println(t);
        }
    }

