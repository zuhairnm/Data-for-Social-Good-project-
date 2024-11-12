import java.util.Scanner;

public class DataRunner {

  // Main method, entry point for the program
  public static void main(String[] args) {
    
    // Create an instance of the UserStory class, which automatically loads data from the files
    UserStory Eater = new UserStory();
    
    // Print the string representation of the 'Eater' object, which includes all foods,
    // their calories, and servings. This uses the overridden toString method from UserStory.
    System.out.println(Eater);

  
    
  }
}
