package OppsV2.innnerclass.memberInnerClass;

import OppsV2.innnerclass.memberInnerClass.Bike;
import OppsV2.innnerclass.memberInnerClass.Car;
import OppsV2.innnerclass.memberInnerClass.Engine;

public class Test {

    public static void main(String[] args) {
//        Car car = new Car("Tata-Safari");
//        Car.Engine engine = car.new Engine();
//
//        engine.start();
//        engine.stop();


        //SAME THING DOING ANOTHER WAY..

        Bike bike = new Bike("Rajdoot-175");
        Engine engine = new Engine(bike);
        engine.start();
        engine.stop();

        Bike bike2 = new Bike("Hero-Honda");
        Engine engine1 = new Engine(bike2);
        engine1.start();
        engine1.stop();

    }
}
