package Homework_2dot1;

public class Task9
{
    public static void main(String[] args)
    {
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person);
    }

    public static void changePerson(Person person)
    {
        person = new Person("Ilya", "Lagutenko");
    }
    // "Lyapis", "Trubetskoy". Потому что метод не может изменил объект, полученный как параметр.
}
