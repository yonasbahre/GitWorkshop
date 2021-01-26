import java.util.ArrayList;

class Order {
    public int totalCost = 0;
    public ArrayList<String> items = new ArrayList<String>();

    public void printOrder() {
        System.out.println("Your total is $" + totalCost);
        System.out.println("Here are your items: " + items);
    }

    public void addDrink() {
        int price = 3;
        System.out.println("Added a Drink for $" + Integer.toString(price));
        items.add("Drink");
        totalCost += price;
    }
    
    public void addFries() {
        int price = 2;
        System.out.println("Added fries for $ " + Integer.toString(price));
        items.add("Fries");
        totalCost += price;
    }
}