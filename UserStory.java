import java.util.Scanner;

public class UserStory {

// Arrays to store the food names, calories, and servings data
private String[] foods;
private String[] calories;
private String[] servings;

// Constructor that initializes the arrays by reading data from text files
public UserStory() {
// Reads the contents of the "foods.txt" file into the foods array
foods = FileReader.toStringArray("foods.txt");
// Reads the contents of the "calories.txt" file into the calories array
calories = FileReader.toStringArray("calories.txt");
// Reads the contents of the "servings.txt" file into the servings array
servings = FileReader.toStringArray("servings.txt");
}

// Method to print the calories for a given food name
public void getCaloriesByFoodName(String name) {
// Loop through each food entry in the foods array
for (int i = 0; i < foods.length; i++) {
// Check if the current food matches the name parameter
if (foods[i].equals(name)) {
// If a match is found, print the food name and its corresponding calorie value
System.out.println("Food: " + foods[i] + ", Calories: " + calories[i]);
}
}
}

// Method to print the number of servings for a given food name
public void getServingsByFoodName(String name) {
// Loop through each food entry in the foods array
for (int i = 0; i < foods.length; i++) {
// Check if the current food matches the name parameter
if (foods[i].equals(name)) {
// If a match is found, print the food name and its corresponding servings value
System.out.println("Food: " + foods[i] + ", Servings: " + servings[i]);
}
}
}

// Overridden toString method to generate a formatted string representation of all food items
public String toString() {
// Start with an empty result string
String result = "";

// Loop through each food entry in the foods array
for (int i = 0; i < foods.length; i++) {
// Create formatted strings for food, calories, and servings
String foodText = "\nName: " + foods[i];
String calText = "\nCalories: " + calories[i];
String servText = "\nServings: " + servings[i];

// Concatenate these formatted strings to the result
result += foodText + calText + servText + "\n";
}

// Return statement
return result;
}
}

