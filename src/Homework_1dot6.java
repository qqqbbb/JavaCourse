import java.util.Arrays;

public class Homework_1dot6
{
    public static int[]  arr;
    public static void main(String[] args)
    {
        arr = generateRandomArray();
        Task_1.Print();
        Task_2.Print();
        Task_3.Print();
        Task_4.Print();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public class Task_1
    {
        public static void Print()
        {
            int sum = 0;
            for (int i = 0; i < arr.length; i++)
                sum += arr[i];

            System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        }
    }
    public class Task_2
    {
        public static void Print()
        {
//            Arrays.sort(arr);
            int min = (int)Double.POSITIVE_INFINITY;
            int max = 0;
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] < min)
                    min = arr[i];
                if (arr[i] > max)
                    max = arr[i];
            }
            System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
            System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
        }
    }
    public class Task_3
    {
        public static void Print()
        {
            int sum = 0;
            for (int i = 0; i < arr.length; i++)
                sum += arr[i];

            float average = (float)sum / (float) arr.length;
            System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
        }
    }
    public class Task_4
    {
        public static void Print()
        {
            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            String name = "";
            for (int i = reverseFullName.length - 1; i >= 0; i--){
                name += reverseFullName[i];
            }
            System.out.println(name);
        }
    }

}
