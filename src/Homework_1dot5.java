public class Homework_1dot5
{
    public static void main(String[] args) {
        {
            Task_2.Print();
            Task_3.Print();
//            Task_4.Print();
        }
    }
    public class Task_1
    {
        int[] array = new int[]{1,2,3};
        float[] floatArray = {-1.57f, 7.654f, 9.986f };
        boolean[] bools = {false,true};
    }
    public class Task_2
    {
        static int[] array = new int[]{1,2,3};
        static float[] floatArray = {-1.57f, 7.654f, 9.986f };
        static boolean[] bools = {false,true};
        public static void Print()
        {
            for (int i = 0; i <array.length; i++)
                System.out.print(array[i] + ",");

            System.out.println();
            for (int i = 0; i <floatArray.length; i++)
                System.out.print(floatArray[i] + ",");

            System.out.println();
            for (int i = 0; i <bools.length; i++)
                System.out.print(bools[i] + ",");
        }
    }
    public class Task_3
    {
        static int[] array = new int[]{1,2,3};
        static float[] floatArray = {-1.57f, 7.654f, 9.986f };
        static boolean[] bools = {false,true};
        public static void Print()
        {
            for (int i = array.length -1; i >= 0; i--)
                System.out.print(array[i] + ",");

            System.out.println();
            for (int i = floatArray.length -1; i >= 0; i--)
                System.out.print(floatArray[i] + ",");

            System.out.println();
            for (int i = bools.length -1; i >= 0; i--)
                System.out.print(bools[i] + ",");
        }
    }
    public class Task_4
    {
        static int[] array = new int[]{1,2,3};

        public static void Print()
        {
            for (int i = 0; i < array.length; i++)
            {
                if (array[i] % 2 != 0)
                {
//                    System.out.print(array[i] + " odd ");
                    array[i] ++;
                }
            }
        }
    }
}
