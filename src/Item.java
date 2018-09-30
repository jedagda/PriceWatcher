/*
 * The class Item stores the name, url address, price, change in percentage, date added
 */
public class Item {

            private String name;
            private String url;
            private float price;
            private final float initialPrice = price;
            private float change;
            private String dateAdded;

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


            public Item(String name, String url, float price, float change, String dateAdded){
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

            public  float getPrice(){
                return price;
            }

            public float getChange(){
                return change;
            }

            public String getDateAdded(){
                return dateAdded;
            }


}
