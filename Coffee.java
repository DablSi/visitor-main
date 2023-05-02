public class Coffee implements IStoreItem {
    // Complete this code
    private String brand;
    private double price;
    private double tax;
    private boolean discount;

    public Coffee(String brand, double price, double tax, boolean discount) {
        this.brand = brand;
        this.price = price;
        this.tax = tax;
        this.discount = discount;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }

    public boolean isDiscount() {
        return discount;
    }

    @Override
    public double accept(IStoreVisitor visitor) {
        return visitor.visit(this);
    }
}
