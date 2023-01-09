public class Homework_1dot7
{
    public static void main(String[] args)
    {
        Task1.print();
        Task2.print();
        Task3.print();
    }

    public class Task1
    {
        public static void print()
        {
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";
            String fullName = firstName + " " + middleName + " " + lastName;
            System.out.println("ФИО сотрудника - " + fullName);
        }
    }
    public class Task2
    {
        public static void print()
        {
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";
            String fullName = firstName + " " + middleName + " " + lastName;
            fullName = fullName.toUpperCase();
            System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName);
        }
    }
    public class Task3
    {
        public static void print()
        {
            String firstName = "Семён";
            String middleName = "Семёнович";
            String lastName = "Иванов";
            String fullName = firstName + " " + middleName + " " + lastName;
            fullName = fullName.replace('ё', 'е');
            System.out.println("Данные ФИО сотрудника - " + fullName);
        }
    }
}
