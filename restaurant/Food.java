package restaurant;

public class Food {
    String name;
    double price;
    int calories;
    String[] ingredient;
    int[] ingrdientQuantity;
    String type;
    int amountOfIngredient;

    public Food(String name, double price, int calories, String type) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.type = type;
        this.ingredient = new String[10];
        this.ingrdientQuantity = new int[10];
    }

    public void addIngredinet(String ing, int quantiti) {
        ingredient[amountOfIngredient] = ing;
        ingrdientQuantity[amountOfIngredient] = quantiti;
        amountOfIngredient++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 50 && price <= 1000) {
            this.price = price;
        }
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmountOfIngredient() {
        return amountOfIngredient;
    }

    public void setAmountOfIngredient(int amountOfIngredient) {
        this.amountOfIngredient = amountOfIngredient;
    }

    public int[] getIngrdientQuantity() {
        return ingrdientQuantity;
    }

    public String[] getIngredient() {
        return ingredient;
    }
}
