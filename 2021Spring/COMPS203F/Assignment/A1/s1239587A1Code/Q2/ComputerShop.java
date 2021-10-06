// ComputerShop

import java.util.*;

public class ComputerShop {
    HashMap<String, Router> routerMap = new HashMap<String, Router>();

    public void addRouter(Router oneRouter) {
        String key = oneRouter.getBrand() + ": " + oneRouter.getModelNumber();
        routerMap.put(key, oneRouter);
    }

    public void showRouter() {
        for(String k : routerMap.keySet()) {
            System.out.println(routerMap.get(k));
        }
    }

    public Set<String> modelNumberSet() {
        Set<String> returnSet = new HashSet<String>();
        for (Router r : routerMap.values()) {
            returnSet.add(r.getModelNumber());
        }
        return returnSet;
    }

    public List<Double> priceList() {
        List<Double> returnList = new ArrayList<Double>();
        for (Router r : routerMap.values()) {
            returnList.add(r.getPrice());
        }
        return returnList;
    }
}
