package Homework_2dot1;

public class Task10
{
    public static void main(String[] args)
    {
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person);
    }

    public static void changePerson(Person person)
    {
        person.name = "Ilya";
        person.surname = "Lagutenko";
    }
    // "Ilya", "Lagutenko". Потому что метод changePerson изменил значения полей.
}
