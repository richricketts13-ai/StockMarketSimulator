public class Main {
    public static void main(String[] args) {

      
        Stock apple = new Stock("Apple", "AAPL", 100.00);
        Investor investor = new Investor("John Doe", 1000.00);

        System.out.println("Initial price: $" + apple.getPrice());
       
       investor.buyShares(apple, 5);
       System.out.println("Shares owned: " + investor.getSharesOwned());
       System.out.println("Portfolio value: $" + investor.getPortfolioValue(apple));

       for (int i = 0; i < 10; i++) {
            apple.updatePriceRandomly();
            System.out.println("Day " + (i + 1));
            System.out.println("Updated price: $" + apple.getPrice());
            System.out.println("Portfolio value: $" + investor.getPortfolioValue(apple));
            

       }
    }
}
