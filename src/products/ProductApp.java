package products;

public class ProductApp {
    public static void main(String[] args) {
        Category category1 = new Category("Samochody");
        Category category2 = new Category("Gazety");
        Category category3 = new Category("Produkty dla niemowląt");
        Category category4 = new Category("Elektronika");

        Product product1 = new Product("Honda Civic", "Samochód osobowy", 50000, category1);
        Product product2 = new Product("Swiat Nauki", "Czasopismo popularno naukowe", 9.9, category2);
        Product product3 = new Product("Bebilon3", "Mleko dla dzieci", 58, category3);
        Product product4 = new Product("Radio", "Radio przenośne", 200, category4);

        System.out.println(product1.getProductInfo());
        System.out.println(product2.getProductInfo());
        System.out.println(product3.getProductInfo());
        System.out.println(product4.getProductInfo());

    }
}