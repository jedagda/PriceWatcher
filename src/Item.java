import java.util.Date;

/*
 * The class Item stores the name, url address, price, change in percentage, date added
 */
public class Item {

    private String name;
    private String url;
    private double price;
    private double initialPrice;
    private double change;
    private String dateAdded;

    /**
     * Constructor for Item with no arguments
     */
    public Item(){
        name = "null";
        initialPrice = 0.0;
        price = 0.0;
    }

    /**
     * Constructor for Item
     * @param name is a String parameter that represents the name of the Item.
     * @param url is a String parameter that represents the URL address of the Item.
     * @param price is a double parameter that reprecents the price of the Item.
     * @param change is a double parameter that represents the percentage change in price of the Item.
     * @param dateAdded is a String parameter that represents the date when the Item was added to PriceWatcher.
     *                  Formula: ((P₂-P₁)/P₁) x 100
     */


    public Item(String name, String url, double initialPrice, double change, String dateAdded){
        this.name = name;
        this.url = url;
        this.price = initialPrice;
        this.initialPrice = initialPrice;
        this.change = change;
        this.dateAdded = dateAdded;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
        this.change= ((this.price - this.initialPrice)/this.initialPrice)*100;
    }


    public String getName(){
        return name;
    }

    public String getURL(){
        return url;
    }

    public double getPrice(){
        return price;
    }

    public double getInitialPrice(){return initialPrice; }

    public double getChange(){
        return change;
    }

    public String getDateAdded(){
        return dateAdded;
    }

    public String getPriceToString(){
        return Double.toString(price);
    }

    public String getPriceChangeToString(){
        return Double.toString(getChange());
    }





}