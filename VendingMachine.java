public class VendingMachine {

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


}
