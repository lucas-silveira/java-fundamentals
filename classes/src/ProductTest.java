public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "John";
        product.price = 4356.89;
        product.discount = 0.1;

        System.out.println(product.name); // John
    }
}
