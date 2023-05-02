public class Book implements IStoreItem {
    // Complete this code
    private String isbn;
    private double price;
    private double tax;

    public Book(String isbn, double price, double tax) {
        this.isbn = isbn;
        this.price = price;
        this.tax = tax;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }

    @Override
    public double accept(IStoreVisitor visitor) {
        return visitor.visit(this);
    }

}
