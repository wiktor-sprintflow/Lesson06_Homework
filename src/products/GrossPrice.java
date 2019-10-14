package products;

class GrossPrice {

    private int vat;
    private double vatAmount;

    private double netToGross(Product product) {
        String categoryName = product.getCategory().getName();

        switch (categoryName) {
            case "Samochody":
                vat = 23;
                break;
            case "Gazety":
                vat = 8;
                break;
            case "Produkty dla niemowląt":
                vat = 5;
                break;
            default:
                vat = 23;
        }

        vatAmount = product.getNetPrice() * vat / 100;
        double grossAmount = product.getNetPrice() + vatAmount;

        return grossAmount;
    }

    String getGrossPriceInfo(Product product) {
        double grossAmount = netToGross(product);
        return ("Stawka vat: " + vat + "%, Wartość VAT: " + vatAmount + ", Cena brutto: " + grossAmount);
    }
}
