public interface IStoreVisitor {
    double visit(Book book);
    double visit(Tea tea);
    double visit(Coffee coffee);

}
