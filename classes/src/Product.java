import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
    String name;
    double price;
    double discount;

    double priceWithDiscount() {
        BigDecimal value = new BigDecimal(price * (1 - discount));
        return value.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }
}
