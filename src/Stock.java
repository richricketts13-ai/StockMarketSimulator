public class Stock {

    //Fields 
    private String companyName;
    private String ticker;
    private double price;

    //Constructor 
    public Stock(String companyName, String ticker, double price) {
        this.companyName = companyName;
        this.ticker = ticker;
        this.price = price;

    } 

    //Methods
    public String getCompanyName() {
        return this.companyName;
    }

    public String getTicker() {
        return this.ticker;
    }
    
    public double getPrice() {
        return this.price;
    }

    public void updatePrice(double newPrice) {
        if (newPrice <= 0) {
            return;
        }
        this.price = newPrice;
    } 

    public void updatePriceRandomly() {
        double min = -0.05;
        double max = 0.05;
        double changePercent = min + (Math.random() * (max - min));
        double newPrice = this.price * (1 + changePercent);
        updatePrice(newPrice);
    }

}
