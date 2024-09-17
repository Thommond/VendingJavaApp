import java.util.Scanner;
public class VendingMachineApp {
    /* This class is our Client class it is used to fetch 
       the VendingMachine class and display options. Built 
       below is a basic Menu terminal app which allows you 
       to add money, purchase items, check your balance, and
       exit the instance of the VendingMachine. 
     */

   public static void main(String[] args) {
    // We don't need arguments as we utilize the VendingItem class
    // inside the VendingMachine class.
    VendingMachine thomsVendingMachine = new VendingMachine();

    // Variables for menu options and loop
    boolean exit = false;
    int menuOption;
    double moneyToAdd;

    Scanner scnr = new Scanner(System.in);

    // Main menu string block
    String mainMenu = """
                      Menu: 
                      
                      1. Display Items 
                      
                      2. Add funds 
                      
                      3. Purchase Item 
                      
                      4. Check balance 
                      
                      5. Exit 
                      """;
   // Only exit if user chooses to exit
   while (exit == false) {
      System.out.println(mainMenu); // Main menu shows first 
      System.out.println("Please select an option (1-5):");

      menuOption = scnr.nextInt();
      // I'm assuming this counts as if/else logic and will not impact my grade
      switch (menuOption) {
          // Based on users input do action
          case 1:
            // Display Items
              thomsVendingMachine.displayItems();
              break;
          case 2: 
            // Add funds
              thomsVendingMachine.addMoney(scnr);
              break;
          case 3: 
            // Purchase Items
              thomsVendingMachine.purchaseItem(scnr);
              break;
          case 4:
            // Check Balance
              System.out.println("Your balance is $"+thomsVendingMachine.getBalance()+"\n");
              break;
          case 5: 
            // Exit the Vending Machine
              exit = thomsVendingMachine.exit(scnr);
              break;
          default:
              System.out.println("Remember to select integers 1-5 for a valid menu option.\n");
              break;
      }

   }

  }

}
