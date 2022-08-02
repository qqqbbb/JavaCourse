public class Homework_1dot8
{
    public static void main(String[] args)
    {
        isLeapYear(1555);
        checkDevice(0, 2020);
        calculateDeliveryDays(222);
    }
    //  task 1
    public static void isLeapYear(int year)
    {
        if (year % 4 == 0 || year % 400 == 0 || year % 100 != 0)
            System.out.println(year + " високосный год");
        else
            System.out.println(year + " не високосный год");
    }
//  task 2
    public static void checkDevice(int clientOS, int releaseYear)
    {
//        int currentYear =  java.time.LocalDate.now().getYear();
        if (clientOS == 0) {
            if (releaseYear < 2015)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            else
                System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            if (releaseYear < 2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            else
                System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }
//  task 3
    public static void calculateDeliveryDays(int deliveryDistance)
    {
        int deliveryDays = 1;
        for (int i = 20; i < deliveryDistance; i += 40)
            deliveryDays++;

        System.out.println("Потребуется дней: " + deliveryDays);
    }

}
