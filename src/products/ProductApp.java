package products;

public class ProductApp {
    public static void main(String[] args) {
        Category category1 = new Category("Samochody");
        Category category2 = new Category("Gazety");
        Category category3 = new Category("Produkty dla niemowląt");
        Category category4 = new Category("Elektronika");

        GrossPrice grossPrice = new GrossPrice();

        Product product1 = new Product("Honda Civic", "Samochód osobowy", 50000, category1);
        Product product2 = new Product("Swiat Nauki", "Czasopismo popularno naukowe", 9.9, category2);
        Product product3 = new Product("Bebilon3", "Mleko dla dzieci", 58, category3);
        Product product4 = new Product("Radio", "Radio przenośne", 200, category4);

        System.out.println(product1.getProductInfo() + ", " + grossPrice.getGrossPriceInfo(product1));
        System.out.println(product2.getProductInfo() + ", " + grossPrice.getGrossPriceInfo(product2));
        System.out.println(product3.getProductInfo() + ", " + grossPrice.getGrossPriceInfo(product3));
        System.out.println(product4.getProductInfo() + ", " + grossPrice.getGrossPriceInfo(product4));
    }
}
