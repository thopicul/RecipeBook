import java.util.ArrayList;

public class Dish {
    private String name;
    
    private ArrayList<String> ingredients;
    private ArrayList<Integer> quantity; 
    private ArrayList<String> metric;
    
    public Dish(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
        this.quantity = new ArrayList<>();
        this.metric = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }
    public ArrayList<Integer> getQuantity() {
        return quantity;
    }
    public ArrayList<String> getMetric() {
        return metric;
    }
    public void setName(String n) {
        name = n; 
    }
     public void setIngredient ( String old, String ing) {
        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i).equals(old)) {
                ingredients.set(i, ing);
                break;
            }

        }
     }
    public void setQuantity ( String ingredient, int quant) {
        for ( int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i).equals(ingredient)) {
                quantity.set(i, quant);
                break;
            }

        }
    }
        public void setMetric( String ingredient, String met) {
            for ( int i = 0; i < ingredients.size(); i++) {
                if (ingredients.get(i).equals(ingredient)) {
                    metric.set(i, met);
                    break;
                }

            }
        }
    public void addDish(String ingredient, int quant, String metr) {
        ingredients.add(ingredient);
        quantity.add(quant);
        metric.add(metr);
    }
    
  public void printDish () {
    System.out.println("Dish: " + name);
    System.out.println("Ingredients:");
    for ( int i = 0 ; i < ingredients.size(); i++) {
        
      System.out.println("- " + ingredients.get(i) + " (" + quantity.get(i) + ") " + metric.get(i));
    }
  }
}