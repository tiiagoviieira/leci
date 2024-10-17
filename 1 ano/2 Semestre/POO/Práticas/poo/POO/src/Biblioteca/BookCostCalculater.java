package Biblioteca;

public class BookCostCalculater implements IBookCostCalculator {
    @Override
    public double calculateCost(int days) {
        if (days <= 5) {
            return 2.00;
        } else {
            return 2.00 + (days - 5) * 0.75;
        }
    }
}
