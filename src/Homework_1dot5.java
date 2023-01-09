public class Homework_1dot5
{
    public static void main(String[] args)
    {
        Task2.print();
        Task3.print();
        Task4.print();
    }
    public class Task1
    {
        int[] array = new int[]{1,2,3};
        float[] floatArray = {-1.57f, 7.654f, 9.986f };
        boolean[] bools = {false,true};
    }
    public class Task2
    {
        static int[] array = new int[]{1,2,3};
        static float[] floatArray = {-1.57f, 7.654f, 9.986f };
        static boolean[] bools = {false,true};
        public static void print()
        {
            for (int i = 0; i <array.length; i++)
            {
                if (i == array.length-1)
                    System.out.print(array[i]);
                else
                    System.out.print(array[i] + ",");
            }
            System.out.println();

            for (int i = 0; i <floatArray.length; i++)
            {
                if (i == floatArray.length - 1)
                    System.out.print(floatArray[i]);
                else
                    System.out.print(floatArray[i] + ",");
            }
            System.out.println();
            for (int i = 0; i <bools.length; i++)
            {
                if (i == bools.length - 1)
                    System.out.print(bools[i]);
                else
                    System.out.print(bools[i] + ",");
            }
            System.out.println();
        }
    }
    public class Task3
    {
        static int[] array = new int[]{1,2,3};
        static float[] floatArray = {-1.57f, 7.654f, 9.986f };
        static boolean[] bools = {false,true};
        public static void print()
        {
            for (int i = array.length -1; i >= 0; i--)
            {
                if (i == 0)
                    System.out.print(array[i]);
                else
                    System.out.print(array[i] + ",");
            }

            System.out.println();
            for (int i = floatArray.length -1; i >= 0; i--)
            {
                if (i == 0)
                    System.out.print(floatArray[i]);
                else
                    System.out.print(floatArray[i] + ",");
            }

            System.out.println();
            for (int i = bools.length -1; i >= 0; i--)
            {
                if (i == 0)
                    System.out.print(bools[i]);
                else
                    System.out.print(bools[i] + ",");
            }
            System.out.println();
        }
    }
    public class Task4
    {
        static int[] array = new int[]{1,2,3};

        public static void print()
        {
            for (int i = 0; i < array.length; i++)
            {
                if (array[i] % 2 != 0)
                {
                    array[i] ++;
                    System.out.println(array[i]);
                }
            }
        }
    }

}
