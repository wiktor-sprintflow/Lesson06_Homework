package products;

class Product {
    private String name;
    private String description;
    private double netPrice;
    private Category category;
    private int vat;

    Product(String name, String description, double netPrice, Category category) {
        this.name = name;
        this.description = description;
        this.netPrice = netPrice;
        this.category = category;

        switch (this.category.getName()) {
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
    }

    Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getVat() {
        return vat;
    }

    String getProductInfo() {
        GrossPrice grossPrice = new GrossPrice();

        double priceWithVat = grossPrice.netToGross(this);
        double vatAmount = priceWithVat - netPrice;

        return ("Nazwa: " + name + ", Opis: " + description + ", Kategoria: " + category.getName() + ", Cena netto: " + netPrice +
                ", Stawka VAT: " + vat + ", Wartość VAT: " + vatAmount + ", Kwota brutto: " + priceWithVat);
    }
}