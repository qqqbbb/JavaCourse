package Homework_2dot2part2;

public class Vehicle
{
    private String modelName;
    private int wheelCount;

    public String getModelName()
    {
        return modelName;
    }

    public void setModelName(String modelName)
    {
        this.modelName = modelName;
    }

    public int getWheelCount()
    {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount)
    {
        this.wheelCount = wheelCount;
    }

    public void changeTyre() {
        System.out.println("Меняем покрышку");
    }
}
