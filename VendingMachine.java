
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

    public String displayItems() {
        return "";
    }

    public void purchaseItem() {
        
    }

    // Method to check the current balance
    public String checkBalance() {
        return "Current balance: $" + this.balance;
    }

    public void addMoney() {
        System.out.print("Enter amount to add: $");
        // double amount = scanner.nextDouble();
        // scanner.nextLine(); // Consume newline

        // Update the vending machine's balance
        // this.balance = amount;
        // thomsVendingMachine.setCurrentBalance(currentBalance + amount);
        // System.out.println("Added $" + amount + " to your balance.");
    }

    public void exit() {
        System.out.print("Goodbye, Enjoy!");
    }

}
