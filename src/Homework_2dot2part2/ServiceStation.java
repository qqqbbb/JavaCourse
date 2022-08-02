package Homework_2dot2part2;

public class ServiceStation
{
    public void check(Vehicle vehicle)
    {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelCount(); i++) {
            vehicle.changeTyre();
        }
        if (vehicle instanceof Car) {
            ((Car) vehicle).checkEngine();
        }
        if (vehicle instanceof Truck) {
            ((Truck) vehicle).checkTrailer();
        }

    }
}
