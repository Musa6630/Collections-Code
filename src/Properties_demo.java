import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Properties_demo {
    public static void main(String[] args) throws Exception {
        Properties p=new Properties();
        FileInputStream fis=new FileInputStream("my.txt");
        p.load(fis);
        System.out.println(p);
        String s=p.getProperty("venki");
        System.out.println(s);
        p.setProperty("nag","8889");
        FileOutputStream fos=new FileOutputStream("my.txt");
        p.store(fos,"Updated by Musabbir");
    }
}
