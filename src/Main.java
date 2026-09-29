public class Main {
    public static void main(String[] args) {

        Investor investor1 = new Investor("Alice", 10000);
        Investor investor2 = new Investor("Bob", 5000);
        Investor investor3 = new Investor("Charlie", 2000);

        System.out.println("Initial Balances:");
        System.out.println(investor1.getName() + ": $" + investor1.getBalance());
        System.out.println(investor2.getName() + ": $" + investor2.getBalance());
        System.out.println(investor3.getName() + ": $" + investor3.getBalance());

        Stock AAPL = new Stock("Apple Inc.", "AAPL", 150);
        
    
        investor1.buyShares(AAPL, 20);
        investor2.buyShares(AAPL, 10);
        investor3.buyShares(AAPL, 5);

        System.out.println("After Purchasing Shares:");
        System.out.println(investor1.getName() + ": $" + investor1.getBalance() + " Shares owned: " + investor1.getSharesOwned());
        System.out.println(investor2.getName() + ": $" + investor2.getBalance() + " Shares owned: " + investor2.getSharesOwned());
        System.out.println(investor3.getName() + ": $" + investor3.getBalance() + " Shares owned: " + investor3.getSharesOwned());

        System.out.println("Portfolio Values:");
        System.out.printf("%s: $%.2f%n", investor1.getName(), investor1.getPortfolioValue(AAPL));
        System.out.printf("%s: $%.2f%n", investor2.getName(), investor2.getPortfolioValue(AAPL));
        System.out.printf("%s: $%.2f%n", investor3.getName(), investor3.getPortfolioValue(AAPL));

        double aliceStartingValue = investor1.getPortfolioValue(AAPL);
        double bobStartingValue = investor2.getPortfolioValue(AAPL);
        double charlieStartingValue = investor3.getPortfolioValue(AAPL);


       for (int i = 0; i < 10; i++) {

        System.out.println("Day " + (i + 1));

        AAPL.updatePriceRandomly();
        System.out.printf("Updated price: $%.2f%n", AAPL.getPrice());

        System.out.println("Updated Portfolio Values:");
        System.out.printf("%s: $%.2f%n", investor1.getName(), investor1.getPortfolioValue(AAPL));
        System.out.printf("%s: $%.2f%n", investor2.getName(), investor2.getPortfolioValue(AAPL));
        System.out.printf("%s: $%.2f%n", investor3.getName(), investor3.getPortfolioValue(AAPL));  
        

    
        }
        double aliceGainLoss = investor1.getPortfolioValue(AAPL) - aliceStartingValue;
        double bobGainLoss = investor2.getPortfolioValue(AAPL) - bobStartingValue;
        double charlieGainLoss = investor3.getPortfolioValue(AAPL) - charlieStartingValue;


        System.out.println("Profit/Loss:");
        System.out.printf("%s: $%.2f%n", investor1.getName(), aliceGainLoss);
        System.out.printf("%s: $%.2f%n", investor2.getName(), bobGainLoss);
        System.out.printf("%s: $%.2f%n", investor3.getName(), charlieGainLoss);

        if (aliceGainLoss > 0) {
            System.out.printf("%s made a profit of $%.2f%n", investor1.getName(), aliceGainLoss);
        } else if (aliceGainLoss < 0) {
            System.out.printf("%s incurred a loss of $%.2f%n", investor1.getName(), Math.abs(aliceGainLoss));
        } else {
            System.out.printf("%s broke even.%n", investor1.getName());
        }

        if (bobGainLoss > 0) {
            System.out.printf("%s made a profit of $%.2f%n", investor2.getName(), bobGainLoss);
        }else if (bobGainLoss < 0) {
            System.out.printf("%s incurred a loss of $%.2f%n", investor2.getName(), Math.abs(bobGainLoss));
        } else {
            System.out.printf("%s broke even.%n", investor2.getName());
        }

        if (charlieGainLoss > 0) {
            System.out.printf("%s made a profit of $%.2f%n", investor3.getName(), charlieGainLoss);
        } else if (charlieGainLoss < 0) {
            System.out.printf("%s incurred a loss of $%.2f%n", investor3.getName(), Math.abs(charlieGainLoss));
        } else {
            System.out.printf("%s broke even.%n", investor3.getName());
        }

       }
    }

