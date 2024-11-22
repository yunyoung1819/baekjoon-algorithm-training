package programmers.algorithm;

class Foo {
    public static String classVar = "I am class var";
    public String instanceVar = "I am instance var";

    public static void classMethod() {
        System.out.println(classVar);    // OK
//      System.out.println(instanceVar); // Error
    }

    public void instanceMethod() {
        System.out.println(classVar);    // OK
        System.out.println(instanceVar); // OK
    }
}

public class StaticApp {

    public static void main(String[] args) {
        System.out.println(Foo.classVar);
//      System.out.println(Foo.instanceVar); // Error

        Foo.classMethod();
//        Foo.instanceMethod();

        Foo f1 = new Foo();
        Foo f2 = new Foo();

        System.out.println(f1.classVar);    // I am class var
        System.out.println(f1.instanceVar); // I am instance var

        f1.classVar = "changed by f1";
        System.out.println(Foo.classVar); // changed by f1
        System.out.println(f2.classVar);  // changed by f1

        f1.instanceVar = "changed by f1";
        System.out.println(f1.instanceVar);  // changed by f1
        System.out.println(f2.instanceVar);  // I am instance var
    }
}
