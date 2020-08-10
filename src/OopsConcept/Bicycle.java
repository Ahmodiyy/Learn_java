package OopsConcept;

public class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int accelerate) {
        speed = speed + accelerate;
    }

    void speedDown(int decelerate) {
        speed = speed + decelerate;
    }

    void printStates() {
        System.out.println("cadece: " + cadence + " speed: " + speed + " gear: " + gear);
    }

    void recursive(){
        new RoadBike();
    }
    static{
        System.out.println("Traffic Light");
    }

    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle();
       /* bike1.changeCadence(2);
        bike1.changeGear(2);
        bike1.speedUp(3);
        bike1.speedDown(2);
        bike1.printStates();

        */
        Road road = new RoadBike();
        road.trafficLight(0, 1);
        bike1.recursive();


    }

    interface Road {
        double A = 0.0;
        double B = 1.0;

        void trafficLight(double a, double b);
    }

    static class RoadBike extends Bicycle implements Road {
        @Override
        public void trafficLight(double a, double b) {
            int light = (int) (Math.random() * 2);
            if (light == A) {
                System.err.println("Stop");
            } else if (light == B) {
                System.out.println("Go");
            }
        }

    }

}
