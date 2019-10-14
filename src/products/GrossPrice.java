package products;

class GrossPrice {
    private double netToGross(Product product) {
        return (product.getNetPrice() + getVatAmount(product));
    }

    private double getVatAmount(Product product){
        return (product.getNetPrice() * getVat(product.getCategory().getName()) / 100);
    }

    private int getVat(String categoryName) {
        int vat;
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
        return vat;
    }

    String getGrossPriceInfo(Product product){
        return("Stawka vat: " + getVat(product.getCategory().getName()) + "%, Wartość VAT: " + getVatAmount(product) + ", Cena brutto: " + netToGross(product));
    }
}
