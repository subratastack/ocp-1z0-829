package interfaces;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierInterfaceExample {

    public static void main(String[] args) {
        Supplier<LocalDateTime> timeImpl = LocalDateTime::now;
        System.out.println(timeImpl.get());
    }
}
