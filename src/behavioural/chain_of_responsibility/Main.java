package behavioural.chain_of_responsibility;

public class Main {
  public static void main(String[] args) {
    PurchaseApprover manager = new Manager();
    PurchaseApprover director = new Director();
    PurchaseApprover ceo = new CEO();

    manager.setNextApprover(director);
    director.setNextApprover(ceo);

    manager.approve(500);
    manager.approve(4000);
    manager.approve(20000);
  }
}
