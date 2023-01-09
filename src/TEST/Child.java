package TEST;

public class Child extends Parent implements TestInterface
{
    public Child(int age)
    {
        super(age);
        System.out.println("child constructor");
    }

    @Override
    public void testMethod()
    {
        System.out.println("child test method");
    }

    @Override
    public void interMethod()
    {

    }

    {
        System.out.println("init block 1");
    }

    static
    {
        System.out.println("static init block ");
    }

    public static void staticMethod()
    {
        System.out.println("child static method");
    }

}
