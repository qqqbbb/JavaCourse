package Homework_2dot1;

public class Task5
{
    public static void main(String[] args)
    {
        int value = 33;
        changeValue(value);
        System.out.println(value);
    }

    public static void changeValue(int value)
    {
        value = 22;
    }

// 33. Потому что нельзя изменить в методе то, что передано в качестве параметра.
}
