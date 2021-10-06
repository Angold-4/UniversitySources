import java.util.*;
public class TestStaff {
    public static void main(String[] args) {

        // Test Manager
        Staff Ashley = new Manager("m7788", "Ashley", 80000.0);
        System.out.println(Ashley);

        // Test SalesPerson
        Staff Charlie = new SalesPerson("s2233", "Charlie", 5000, 2800000);
        System.out.println(Charlie);

        // Test TempStaff
        Staff Michael = new TempStaff("t3344", "Michael", 450, 12);
        System.out.println(Michael);



    }
}
