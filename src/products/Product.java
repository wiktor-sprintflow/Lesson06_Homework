package products;

class Product {
    private String name;
    private String description;
    private double netPrice;
    private Category category;

    Product(String name, String description, double netPrice, Category category) {
        this.name = name;
        this.description = description;
        this.netPrice = netPrice;
        this.category = category;
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

    String getProductInfo() {
        return ("Nazwa: " + name + ", Opis: " + description + ", Kategoria: " + category.getName() + ", Cena netto: " + netPrice);
    }
}
