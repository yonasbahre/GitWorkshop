import java.util.ArrayList;

class Order {
    public int totalCost = 0;
    public ArrayList<String> items = new ArrayList<String>();

    public void printOrder() {
        System.out.println("Your total is $" + totalCost);
        System.out.println("Here are your items: " + items);
    }
    public void shake(int num) {
      totalCost += 12;
      if (num == 1) {
        items.add("Vanilla Shake");
      }
      else if (num ==2) {
        items.add("Chocolate Shake");
      }
      else {
        items.add("Strawberry Shake");
      }
    }
}
