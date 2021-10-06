// TestComputerShop

import java.util.*;

public class TestComputerShop {
    public static void main(String[] args) {
        ComputerShop aShop = new ComputerShop();
        aShop.addRouter(new Router("Linksys", "RVS4000", 1080));
        aShop.addRouter(new Router("Planet", "VRT-311S", 510));

        aShop.showRouter();

        Set<String> modelNumber =  aShop.modelNumberSet();
        for (String m : modelNumber) {
            System.out.println(m);
        }

        List<Double> price = aShop.priceList();
        for (Double p : price) {
            System.out.println(p);
        }
    }

}
