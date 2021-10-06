public class Driver{
    public void drive(Vehicle vehicle){
        vehicle.go();
    }

    public void brake(Vehicle vehicle){
        vehicle.stop();
    }

    public static void main(String[] args){
        Driver Ray = new Driver();
        Fit fit = new Fit();
        Santana santana = new Santana();
        Ray.drive(fit);
        Ray.drive(santana);
    }
}
