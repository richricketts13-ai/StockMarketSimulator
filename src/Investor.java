public class Investor {

    //Fields
    private String name;
    private double balance;
    private int sharesOwned;

    //Constructor 

    public Investor(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.sharesOwned = 0;
    } 
    
    //Methods
    public String getName() {
        return this.name;
    }   

    public double getBalance() {
        return this.balance;
    }   

    public int getSharesOwned() {
        return this.sharesOwned;
    }  

    public void buyShares(Stock stock, int amount) {
        if (amount <= 0) {
            return;
        }
        double totalCost = stock.getPrice() * amount;
        
        if (this.balance >= totalCost) {
            this.balance -= totalCost;
            this.sharesOwned += amount;
        }
    }

    public void sellShares(Stock stock, int amount) {
        if (amount <= 0 || amount > this.sharesOwned) {
            return;
        }
        double totalRevenue = stock.getPrice() * amount;
        this.balance += totalRevenue;
        this.sharesOwned -= amount;

    }

    public double getPortfolioValue(Stock stock) {
         double value = this.balance + (this.sharesOwned * stock.getPrice());
         return value;

    } 

}