public class Homework_1dot4
{
    public static void main(String[] args) {
        Task_1.Print();
        Task_2.Print();
        Task_3.Print();
    }
    public static class Task_1
    {
        public static void Print()
        {
            int i = 0;
            while (i <= 10)
            {
                if (i == 10){
                    System.out.println(i + " ");
                    break;
                }
                else
                {
                    System.out.print(i + " ");
                    i++;
                }
            }
            for (; i >= 0; i--)
                System.out.print(i + " ");

            System.out.println(" ");
        }
    }
    public static class Task_2
    {
        public static void Print()
        {
            int friday = 3;
            for (int i = 0; i <= 31; i++)
            {
                if (i == friday)
                {
                    System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
                    friday += 7;
                }
            }
        }
    }
    public static class Task_3
    {
        public static void Print()
        {
            int cometYear = 0;
            for (int i = 0; i <= 2101; i++)
            {
                if (i == cometYear)
                {
                    if (i > 1822)
                        System.out.println(i );
                    cometYear += 79;
                }
            }
        }
    }


}
