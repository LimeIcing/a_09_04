public class SportUtilityVehicle extends Car {

    @Override
    public void m1() {
        System.out.println("SUV 1");
    }

    @Override
    public void m2() {
        super.m1();
    }

    @Override
    public String toString() {
        return "SUV " + super.toString();
    }
}