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

    public void addNuggies() {
        int price = 5;
        System.out.println("Added Nuggies for $" + Integer.toString(price));
        items.add("Nuggies");
        totalCost += price;
    public void addShake() {
        int price = 5;
        System.out.println("Added a Shake for $" + Integer.toString(price));
        items.add("Shake");
        totalCost += price;

    public void addSalad() {
    	int price = Integer.MAX_VALUE;
    	System.out.println("Added a Salad for $0b"+Integer.toString(price, 2));
    	items.add("Salad");
    	totalCost += price;
    }
}