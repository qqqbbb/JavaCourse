package Homework_2dot1;

public class Person
{
    String name;
    String surname;

    public Person(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }
    @Override
    public String toString()
    {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'';
    }

}
