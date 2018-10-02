import java.util.Date;

/*
 * The class Item stores the name, url address, price, change in percentage, date added
 */
public class Item {

            private String name;
            private String url;
            private double price;
            private final double initialPrice = price;
            private double change;
            private Date dateAdded;

            /**
             * Constructor for Item with no arguments
             */
            public Item(){

            }

            /**
             * Constructor for Item
             * @param name is a String parameter that represents the name of the Item.
             * @param url is a String parameter that represents the URL address of the Item.
             * @param price is a floating point parameter that reprecents the price of the Item.
             * @param change is a floating point parameter that represents the percentage change in price of the Item.
             * @param dateAdded is a String parameter that represents the date when the Item was added to PriceWatcher.
             *                  Formula: ((P₂-P₁)/P₁) x 100
             */


            public Item(String name, String url, double price, double change, Date dateAdded){
                this.name = name;
                this.url = url;
                this.price = price;
                this.change = change;
                this.dateAdded = dateAdded;
            }

            public void setPrice(float newPrice){
                price = newPrice;
            }

            public void setChange(float initialPrice, float price){
                this.change= ((price - initialPrice)/initialPrice)*100;
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

            public double getChange(){
                return change;
            }

            public Date getDateAdded(){
                return dateAdded;
            }

            public String getPriceToString(){
                return Double.toString(getPrice());
            }

            public String getPriceChangeToString(){
                return Double.toString(getChange());
            }





}
