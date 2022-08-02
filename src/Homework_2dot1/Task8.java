package Homework_2dot1;

public class Task8
{
    public static void main(String[] args)
    {
        Integer[] value = {3,4};
        changeValue(value);
        System.out.println(value[0]);
    }

    public static void changeValue(Integer[] value)
    {
        value[0] = 99;
    }
    // значение 0 элемента будет 99. Потому что метод changeValue изменил его.
}
