
public class VendingMachine {

    /* This Blueprint class creates a VendingMachine
       with four options and utilizes the VendingItem 
       class.
    */

    private VendingItem chips;
    private VendingItem cookies;
    private VendingItem candyBar;
    private VendingItem gummies;

    private double balance;

    public VendingMachine() {
        this.balance = 0.0;
        this.chips = new VendingItem("Chips", 1.75);
        this.cookies = new VendingItem("Cookies", 2.00);
        this. candyBar = new VendingItem("Candy Bar", 2.25);
        this.gummies =  new VendingItem("Gummies", 2.50);
    }

    public void displayItems() {
        System.out.println("Available Items \n");
        System.out.println("1. Chips - $"+this.chips.getItemPrice()+"\n");
        System.out.println("2. Cookies - $"+this.cookies.getItemPrice()+"\n");
        System.out.println("3. Candy Bar - $"+this.candyBar.getItemPrice()+"\n");
        System.out.println("4. Gummies - $"+this.gummies.getItemPrice()+"\n");
    }

    public void purchaseItem(String usersChoice) {

        VendingItem itemSelected;

        // Check if the users selection matches an item 
        switch (usersChoice.toLowerCase()) {
            case "1":
                itemSelected = this.chips;
                break;
            case "2":
                itemSelected = this.cookies;
                break;
            case "3":
                itemSelected = this.candyBar;
                break;
            case "4":
                itemSelected = this.gummies;
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

    public void addMoney(double amount) {
        if (amount >= 0.0) {
            this.balance += amount;
            System.out.println("Added $" + amount + " to balance. Current balance $"+ this.balance);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void exit() {
        System.out.print("Goodbye, Enjoy!");
    }

}
