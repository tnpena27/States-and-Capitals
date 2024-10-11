// Import required class
import java.util.*;

public class Main {
  //Main method 
  public static void main(String[] args) {	
    // Create a scanner
    Scanner input = new Scanner(System.in);

    // Store 50 states and their capitals
    HashMap<String, String> statesAndCapitals = getData();

    // Displays contents of the hash map
    System.out.println("HASHMAP OF STATES AND THEIR CAPITALS: ");
    System.out.print(statesAndCapitals + "\n");

    //creates treemap for binary search 
    TreeMap<String, String> inorder = new TreeMap<String, String>(statesAndCapitals);

    // Prints the treemap in order by state
    System.out.print("\nTREEMAP IN ORDER BY STATE: \n");
    System.out.print(inorder + "\n");


    // Prompt the user to enter a state
    System.out.println("\nLEARN THE CAPITALS OF THE STATES!");  

    //Create a loop to keep prompting user to enter a state
    boolean cont = true;
    while (cont) {

    // Prompt the user to enter a state  
    System.out.println("\nEnter a state: ");
      String state = input.nextLine();

    // Display the capital for the state
    if(statesAndCapitals.get(state) != null) {
      System.out.println("The capital of " + state + " is " + statesAndCapitals.get(state));
    }

    // Choice of continuing or ending program  
    System.out.println("\nContinue? 1 for yes, 2 for no");
      int choice = input.nextInt();
      // If user chooses to continue
      if (choice == 1) {
          state = input.nextLine();
        // Display the capital for the state
        if(statesAndCapitals.get(state) != null) {
          System.out.println("The capital of " + state + " is " + statesAndCapitals.get(state));
      }
    }
      // If user chooses to end program  
      else if(choice == 2) {
        cont = false;
        System.out.println("Thank you for playing!");
      }
      // If user enters an invalid input  
      else {
        System.out.println("Invalid input. Please enter 1 or 2.");
          choice = input.nextInt();
        while (choice != 1 && choice != 2) {
          System.out.println("Invalid input. Please enter 1 or 2.");
          choice = input.nextInt();
        // If user chooses to continue
        if (choice == 1) {
          state = input.nextLine();
            // Display the capital for the state
            if(statesAndCapitals.get(state) != null) {
              System.out.println("The capital of " + state + " is " + statesAndCapitals.get(state));
          }
            // If user chooses to end program  
            else if(choice == 2) {
              cont = false;
              System.out.println("Thank you for playing!");
            }
         }
        }
      }
  }
 }
  // getData retrieves the 50 states and their capitals
  public static HashMap<String, String> getData() {
    HashMap<String, String> map = new HashMap<>();
    String[][] data = {
      {"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"},
      {"Arkansas", "Little Rock"}, {"California", "Sacramento"},
      {"Colorado", "Denver"}, {"Connecticut", "Hartford"}, 
      {"Delaware", "Dover"}, {"Florida", "Tallahassee"}, 
      {"Georgia", "Atlanta"}, {"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
      {"Illinois", "Springfield"}, {"Indiana", "Indianapolis"},
      {"Iowa", "Des Moines"}, {"Kansas", "Topeka"}, {"Kentucky", "Frankfort"}, 
      {"Louisiana", "Baton Rouge"}, {"Maine", "Augusta"}, 
      {"Maryland", "Annapolis"}, {"Massachusetts", "Boston"}, 
      {"Michigan", "Lansing"}, {"Minnesota", "Saint Paul"}, 
      {"Mississippi", "Jackson"}, {"Missouri", "Jefferson City"}, 
      {"Montana", "Helena"}, {"Nebraska", "Lincoln"}, 
      {"Nevada", "Carson City"}, {"New Hampshire", "Concord"}, 
      {"New Jersey", "Trenton"}, {"New Mexico", "Santa Fe"}, 
      {"New York", "Albany"}, {"North Carolina", "Raleigh"}, 
      {"North Dakota", "Bismarck"}, {"Ohio", "Columbus"},
      {"Oklahoma", "Oklahoma City"}, {"Oregon", "Salem"}, 
      {"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"}, 
      {"South Carolina", "Columbia"}, {"South Dakota", "Pierre"}, 
      {"Tennessee", "Nashville"}, {"Texas", "Austin"}, 
      {"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"}, 
      {"Virginia", "Richmond"}, {"Washington", "Olympia"}, 
      {"West Virginia", "Charleston"}, {"Wisconsin", "Madison"}, 
      {"Wyoming", "Cheyenne"}};
    // Add the data to the hash map
    for (int i = 0; i < data.length; i++) {
      map.put(data[i][0], data[i][1]);
    }
    // Return the hash map
    return map;
  }
}
