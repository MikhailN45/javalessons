package Inharitance;

import java.util.List;

public class InharitanceMain {
    public static void main(String[] args) {
        Engine truckEngine = new Engine(6.0, EngineType.DIESEL, 900);

       /* Truck truck = new Truck("Volvo", "VNL300", truckEngine, 300, 500, 1000);
        truck.start();
        truck.accelerate(40);
        truck.stop();
        truck.fuelUP(50);
        truck.load();
        truck.unload();*/

        System.out.println("\n");

        ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 1000, 4);
        electricCar.start();
        electricCar.stop();
        electricCar.charge();

        System.out.println("\n");

        Engine busEngine = new Engine(3.5, EngineType.PETROL, 150);

        Bus bus = new Bus("Mercedes", "Splinter", busEngine, 30, 75, 12);
        bus.fuelUP(11);
        bus.pickUpPassengers(4);
        bus.start();
        bus.stop();
        bus.releasePassengers();

        Engine engine = bus.getEngine();
        System.out.println(engine.getEngineType());
        List<Piston> pistons = engine.getPistons();
        System.out.println(pistons);

    }
}
