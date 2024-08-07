import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      
       Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the recipe book, where you can enter different dishes and their ingredients.");
Book recipes = new Book();
      while(true){
        System.out.println("What would you like to do?\n1. Add a dish\n2. View all dishes in the recipe book\n3. View the ingredients in a dish\n4. Search by ingredient \n5. Edit any aspect of a dish\n6. Exit");
       
        String choice = scanner.nextLine();
        if (choice.equals("1") ) {
          System.out.println("Enter the name of the dish:");
           String name = scanner.nextLine();
          Dish dish1 = new Dish(name);
          System.out.println("Enter the ingredients for the dish (type 'stop' to stop inputing ingredients):");
           String ingredient = scanner.nextLine();
          while (!ingredient.equals("stop")) {
            System.out.println("enter the unit of measurment used for this ingredient:");
            String metric = scanner.nextLine();
          
            System.out.println("Enter the Quantity for the ingredient: (please enter a number )");
            int quantity = scanner.nextInt();
            dish1.addDish(ingredient, quantity, metric);
            System.out.println("Enter the next ingredient (type 'stop' to stop inputing ingredients):");
            scanner.nextLine();
            ingredient = scanner.nextLine();
          }
          System.out.println("Dish added successfully!");
          recipes.addDish(dish1);
        }
        if( choice.equals("2") ) {
          System.out.println("Here is a list of all the dishes you entered:");
          recipes.printAllDishes();
        }
        if (choice.equals("3") ) {
          System.out.println("Enter the name of the dish you want to view the ingredients for:");
          String dishName = scanner.nextLine();
          if (recipes.searchDish(dishName)){
        recipes.printIngredients(dishName);
          }
        else {
          System.out.println("no dish found with that name"); 
        }
        }
        if (choice.equals("4")) {
          System.out.println("Enter the ingredient you want to search for:");
          String SearchedIngredient = scanner.nextLine();
          recipes.SearchByIngredient(SearchedIngredient);
        }
        if (choice.equals("5")) {
          System.out.println("what dish would you like to edit?"); 
           String dishName = scanner.nextLine();
          if (recipes.searchDish(dishName) ) {
            System.out.println("What would you like to edit?\n1. Name\n2. Ingredient\n3. Quantity\n4. Metric");
            String editChoice = scanner.nextLine();
            if (editChoice.equals("1")) {
              System.out.println("Enter the new name for the dish:");
              String newName = scanner.nextLine();
              recipes.editName(dishName, newName);
            }
            if (editChoice.equals("2")) {
              recipes.printIngredients(dishName);
              while(true){
              System.out.println("Enter the ingredient you want to edit:");
                 String ingredient = scanner.nextLine();
                if (recipes.hasIngredient(dishName, ingredient)) {
                  System.out.println("Enter the new ingredient:");
                  String newIngredient = scanner.nextLine();
                  recipes.editIngredient(dishName, ingredient, newIngredient);
                  break;
                }
                else {
                  System.out.println("invalid ingredient ");
                }
              }
            }
            if (editChoice.equals("3") ){
              recipes.printIngredients(dishName);
              while(true){
              System.out.println("Enter the ingredient you want to edit:");
                 String ingredient = scanner.nextLine();
                if (recipes.hasIngredient(dishName, ingredient)) {
                  System.out.println("Enter the new Quantity:");
                 int newQuantity = scanner.nextInt();
                  recipes.editQuantity(dishName, ingredient, newQuantity) ;
                  break;
                }
                else {
                  System.out.println("invalid ingredient ");
                }

              }
            }
            if (editChoice.equals("4")) {
              recipes.printIngredients(dishName);
              while(true){
              System.out.println("Enter the ingredient you want to edit:");
                 String ingredient = scanner.nextLine();
                if (recipes.hasIngredient(dishName, ingredient)) {
                  System.out.println("Enter the new metric:");
                  String newMetric = scanner.nextLine();
                  recipes.editMetric(dishName, ingredient, newMetric);
                  break;
                }
                else {
                  System.out.println("invalid ingredient ");
                }
                
              }
            }
          }
          else {
            System.out.println("dish not found");
          }
          
        }

        if (choice.equals("6")) {
          break;
        }
      }
  }
}
        //ww3 schools 
        // stack overflow for arrayList 
        // previous project for constructers 
        
      
