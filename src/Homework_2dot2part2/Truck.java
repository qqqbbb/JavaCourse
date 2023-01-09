package Homework_2dot2part2;

public class Truck extends Car
{
    public Truck(String modelName, int wheels)
    {
        super(modelName, wheels);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
