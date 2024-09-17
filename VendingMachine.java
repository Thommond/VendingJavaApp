import java.util.Scanner;

public class VendingMachine {

    /* This Blueprint class creates a VendingMachine
       with four options and utilizes the VendingItem 
       class.
    */

    private VendingItem item1;
    private VendingItem item2;
    private VendingItem item3;
    private VendingItem item4;

    private double balance;

    // User can simply create vending machine with defaults
    public VendingMachine() {
        this.balance = 0.0;
        this.item1 = new VendingItem("Chips", 1.75);
        this.item2 = new VendingItem("Cookies", 2.00);
        this.item3 = new VendingItem("Candy Bar", 2.25);
        this.item4 =  new VendingItem("Gummies", 2.50);
    }

    // User can add their own items
    public VendingMachine(VendingItem item1, VendingItem item2 , VendingItem item3, VendingItem item4) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
    }

    // Displaying the items in this vending machine instance
    public void displayItems() {
        System.out.println("Available Items \n");
        System.out.println("1. "+this.item1.getItemName().toUpperCase()+" - $"+this.item1.getItemPrice()+"\n");
        System.out.println("2. "+this.item2.getItemName().toUpperCase()+" - $"+this.item2.getItemPrice()+"\n");
        System.out.println("3. "+this.item3.getItemName().toUpperCase()+" - $"+this.item3.getItemPrice()+"\n");
        System.out.println("4. "+this.item3.getItemName().toUpperCase()+" - $"+this.item3.getItemPrice()+"\n");
    }

    public void purchaseItem(Scanner scnr) {
        System.out.println("Choose an option 1-4 for purchase.");

        int itemToPurchase = scnr.nextInt();

        VendingItem itemSelected = null;

        // Check if the users selection matches an item 
        switch (itemToPurchase) {
            case 1:
                itemSelected = this.item1;
                break;
            case 2:
                itemSelected = this.item2;
                break;
            case 3:
                itemSelected = this.item3;
                break;
            case 4:
                itemSelected = this.item3;
                break;
            default:
                // If not let them know
                System.out.println("Invalid, no item selected. Try again!");
                break;
        }

        // Make sure an item is selected
        if (itemSelected != null) {
            // Check if the balance is sufficient
            if (this.balance >= itemSelected.getItemPrice()) {
                this.balance -= itemSelected.getItemPrice();
                System.out.println("Purchased " + itemSelected.getItemName() + " for $" + itemSelected.getItemPrice() + ". Remaining balance: $" + this.balance);
            } else {
                // Inform the user of funds
                System.out.println("Insufficient balance. Please add more money.");
                } 
        }   

    }

    // Method to check the current balance
    public double getBalance() {
        return this.balance;
    }
    
    // Works with menu driven application and houses addsMoney logic
    public void addMoney(Scanner scnr) {
        System.out.println("Please enter a valid dollar amount less then or equal to $10:");

        double amount = scnr.nextDouble();

        if (amount >= 0.0 && amount <= 10.0) {
            this.balance += amount;
            System.out.println("Added $" + amount + " to balance. Current balance $"+ this.balance);
        } else {
            // You can add as much as 10 at a time.
            System.out.println("Invalid amount, enter a positive number lower then 10.");
        }
    }

    // Exits the menu
    public boolean exit(Scanner scnr) {
        scnr.close();
        System.out.println("Goodbye, Enjoy!");
        return true;
    }

}
