package ssm;

public class A {

    public void method() {
        System.out.println(super.getClass().getName());
    }

    public static void main(String[] args) {
        A b  = new A();
        b.method();
    }
}
