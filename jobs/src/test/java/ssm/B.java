package ssm;

import java.util.ArrayList;
import java.util.List;

public class B extends A {
    public void method() {
        System.out.println(super.getClass().getName());
    }

    static List<Class> list = new ArrayList<Class>();

    public static void main(String[] args){
        try {
            for (int i = 0; ; i++) {
                Class c = Class.forName("com.jiangbo.ssm.entity.User");
                c.newInstance();
                list.add(c);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
