public class VendingItem {

    /* This blueprint class allows us to create different 
       types of items to be in our VendingMachine class. 
       This class allows us to create a myriad of vending 
       machine items to give more options in the VendingMachine
     */

    private String itemName;
    private double itemPrice;

    public VendingItem(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    // Getter and Setter for itemName
    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    // Getter and Setter for itemPrice
    public double getItemPrice() {
        return this.itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}
