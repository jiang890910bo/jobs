package ssm.oom_test;

import java.util.ArrayList;
import java.util.List;

public class HeapOOMTest {
    static class OOMObject{

    }
    public static void main(String[] args) {
        /*java¶ÑÒç³ö(jdk1.8/jdk1.7)->Exception in thread "main" java.lang.OutOfMemoryError: Java heap space*/
/*        List<OOMObject> list = new ArrayList<OOMObject>();
        while(true){
            list.add(new OOMObject());
        }*/

        /*javaÕ»Òç³ö(jdk1.8/jdk1.7)->Exception in thread "main" java.lang.StackOverflowError*/
       //HeapOOMTest.loop(0);

        /*
        jdk:1.8->Exception in thread "main" java.lang.OutOfMemoryError: GC overhead limit exceeded
        jdk:1.7->Exception in thread "main" java.lang.OutOfMemoryError: GC overhead limit exceeded
        */
        List<String> list = new ArrayList<String>();
        int i =0;
        while(true){
            list.add(String.valueOf(i++).intern());
        }
    }

    public static void loop(int i){
        loop(i++);
    }

}
