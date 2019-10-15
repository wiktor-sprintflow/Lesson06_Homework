package products;

class GrossPrice {

    double netToGross(Product product) {
        double grossAmount = product.getNetPrice() + product.getNetPrice() * product.getVat() / 100;
        return grossAmount;
    }
}
