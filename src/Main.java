public class Main {
    public static void main(String[] args) {

        // Create a stock
        Stock apple = new Stock("Apple", "AAPL", 100.00);

        // Create an investor
        Investor investor = new Investor("Richard", 1000.00);

        // Initial information
        System.out.println("Stock: " + apple.getCompanyName());
        System.out.println("Ticker: " + apple.getTicker());
        System.out.println("Price: $" + apple.getPrice());

        System.out.println("\nInvestor: " + investor.getName());
        System.out.println("Starting balance: $" + investor.getBalance());
        System.out.println("Starting shares: " + investor.getSharesOwned());

        // Buy 4 shares
        investor.buyShares(apple, 4);

        System.out.println("\nAfter buying 4 shares:");
        System.out.println("Balance: $" + investor.getBalance());
        System.out.println("Shares: " + investor.getSharesOwned());
        System.out.println("Portfolio value: $" + investor.getPortfolioValue(apple));

        // Sell 2 shares
        investor.sellShares(apple, 2);

        System.out.println("\nAfter selling 2 shares:");
        System.out.println("Balance: $" + investor.getBalance());
        System.out.println("Shares: " + investor.getSharesOwned());
        System.out.println("Portfolio value: $" + investor.getPortfolioValue(apple));
    }
}
