package Homework_2dot1;

public class Task7
{
    public static void main(String[] args)
    {
        Integer[] value = {3,4};
        changeValue(value);
        System.out.println(value[0]);
    }

    public static void changeValue(Integer[] value)
    {
        value = new Integer[]{1,2};
    }
    // Массив не измениться. Нельзя изменить в методе то, что передано в качестве параметра.
}
