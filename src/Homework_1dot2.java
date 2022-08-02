public class Homework_1dot2
{
    public static void main(String[] args) {
        Task_2.PrintTotalWeight();
        Task_3.PrintRecipeWeight();
        Task_4.PrintDays();
        Task_5.PrintSalary();
    }

    public static class Task_1 {
        byte byte_ = 1;
        short short_ = 2;
        int int_ = 3;
        long long_ = 3L;
        float float_ = 1.2f;
        double double_ = 1.2;
        char char_ = 'q';
        boolean bool = true;
    }

    public static class Task_2 {
        static float fighter1weight = 78.2f;
        static float fighter2weight = 82.7f;

        public static void PrintTotalWeight() {
            System.out.println("Total weight: " + (fighter1weight + fighter2weight + " kilos"));
        }
    }

    public static class Task_3 {
        static int bananaWeight = 80;
        static int milkWeight = 105;
        static int icecreamWeight = 100;
        static int eggWeight = 70;

        public static void PrintRecipeWeight() {
            int weightInGrams = bananaWeight * 5 + milkWeight * 2 + icecreamWeight * 2 + eggWeight * 4;
            float weightInKilos = weightInGrams / 1000f;
            System.out.println("Weight of ingredients: " + weightInKilos + " kilos");
        }
    }

    public static class Task_4 {
        static int minDays = 7000 / 250;
        static int maxDays = 7000 / 500;

        public static void PrintDays() {
            System.out.println("It will take minimum " + minDays + " days to lose 7 kilos.");
            System.out.println("It will take maximum " + maxDays + " days to lose 7 kilos.");
            System.out.println("It will take an average of " + (minDays + maxDays) / 2 + " days to lose 7 kilos.");
        }
    }

    public static class Task_5 {
        static int mashaSalary = 67760;
        static int denisSalary = 83690;
        static int christinaSalary = 76230;

        public static void PrintSalary() {
            int mashaNewSalary = (int) (mashaSalary * 1.1f);
            int mashaYearIncomeDifference = mashaNewSalary * 12 - mashaSalary * 12;
            System.out.println("Masha's salary is now " + mashaNewSalary + " roubles. Her yearly income is up " + mashaYearIncomeDifference + " roubles.");
            int denisNewSalary = (int) (denisSalary * 1.1f);
            int denisYearIncomeDifference = denisNewSalary * 12 - denisSalary * 12;
            System.out.println("Denis's salary is now " + denisNewSalary + " roubles. His yearly income is up " + denisYearIncomeDifference + " roubles.");
            int christinaNewSalary = (int) (christinaSalary * 1.1f);
            int christinaYearIncomeDifference = christinaNewSalary * 12 - christinaSalary * 12;
            System.out.println("Christina's salary is now " + christinaNewSalary + " roubles. Her yearly income is up " + christinaYearIncomeDifference + " roubles.");
        }
    }

}