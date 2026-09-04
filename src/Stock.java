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

    
}
