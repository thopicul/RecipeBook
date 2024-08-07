import java.util.ArrayList;

public class Book {
    private ArrayList<Dish> dishes;

    public Book() {
        this.dishes = new ArrayList<>();
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public ArrayList<Dish> getDishes() {
        return dishes;
    }
    public void printAllDishes() {
            for (Dish dish : dishes) {
                System.out.println( "-" + dish.getName());
            }
    }
    public boolean searchDish (String name) {
        boolean found = false;
        for (Dish dish: dishes) {
            if (dish.getName().equals(name)) {
                found = true; 
                break;
            }
        }  
  return(found); 
    }
        public void printIngredients(String name) {
            for (Dish dish : dishes) {
                if (dish.getName().equals(name)) {
                    dish.printDish();
                    break;
                }
            }
        }
        
    
    public void editName(String oldName, String newName) {
        for (Dish dish : dishes) {
            if (dish.getName().equals(oldName)) {
                dish.setName(newName);
                break;
            }

        }
    }
   public void editIngredient ( String name, String oldIngredient, String newIngredient) {
        for (Dish dish : dishes) {
            if (dish.getName().equals(name)) {
                dish.setIngredient(oldIngredient, newIngredient);
                break;
            }
        }
 
   }
    public void editQuantity (String name,  String ingredient , int newQuantity) {
        for (Dish dish : dishes) {
            if (dish.getName().equals(name)) {
                dish.setQuantity(ingredient, newQuantity);
                break;
            }
        }
    }
    public void editMetric ( String name, String ingredient, String newMetric) {
        for (Dish dish : dishes) {
            if (dish.getName().equals(name)) {
                dish.setMetric(ingredient, newMetric);
                break;
            }
        }
    }
    
    public void SearchByIngredient(String ingredient) {
        int count = 0; 
        System.out.println("Dishes containing " + ingredient + ":");
        for (Dish dish : dishes) {
            if (dish.getIngredients().contains(ingredient)) {
                System.out.println(dish.getName());
                count++;
            }
            }
        if (count == 0) {
            System.out.println("No dishes found containing " + ingredient); 
        }
        }
    public boolean hasIngredient (String dishname, String ingredient) {
    for (Dish dish : dishes) {
        if (dish.getName().equals(dishname)) {
            if (dish.getIngredients().contains(ingredient)) {
                return true;
            }
        }
    }
return(false);
   }
}
   
