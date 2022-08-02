package Homework_2dot2part2;

public class Car extends Vehicle
{
    public Car(String modelName, int wheels)
    {
        setModelName(modelName);
        setWheelCount(wheels);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
