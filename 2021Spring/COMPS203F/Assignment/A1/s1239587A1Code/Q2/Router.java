// Router
import java.util.*;

public class Router {
    private String brand;
    private String modelNumber;
    private double price;

    public Router(String b, String m, double p) {
        brand = b;
        modelNumber = m;
        price = p;
    }

    public String getBrand() {
        return this.brand;
    }
    
    public String getModelNumber() {
        return this.modelNumber;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "brand: " + this.brand + ", model number: " + this.modelNumber + ", price: " + this.price;
    }

    public static void main(String[] args) {
        // Test
        Router R1 = new Router("Linksys", "RVS4000", 1080);
        System.out.println(R1);
    }
}
