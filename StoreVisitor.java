public class StoreVisitor implements IStoreVisitor {

    @Override
    public double visit(Book book) {
        double cost = book.getPrice() + book.getTax() * book.getPrice();
        return cost;
    }

    @Override
    public double visit(Tea tea) {
        double cost = tea.getPrice() + tea.getTax() * tea.getPrice();
        if (tea.isDiscount())
            cost = cost - cost * 0.1;
        return cost;
    }

    @Override
    public double visit(Coffee coffee) {
        double cost = coffee.getPrice() + coffee.getTax() * coffee.getPrice();
        if (coffee.isDiscount())
            cost = cost - cost * 0.15;
        return cost;
    }
}
