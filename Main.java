public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.name = "Laptop";
        product.description = "Macbook Air";
        product.id = 7;
        product.price = 20.000;
        product.stockAmount = 4;
        product.getId();

        ProductManager productManager = new ProductManager();
        productManager.Add(product);



    }
}