import java.util.ArrayList;

class Order {
    public int totalCost = 0;
    public ArrayList<String> items = new ArrayList<String>();

    public void printOrder() {
        System.out.println("Your total is $" + totalCost);
        System.out.println("Here are your items: " + items);
    }



public void AddShake() {
totalCost = totalCost +4;

System.out.println("Added Shake!Your total is $" + totalCost);
 
}

}
