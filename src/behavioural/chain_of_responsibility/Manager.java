package behavioural.chain_of_responsibility;

public class Manager implements PurchaseApprover {
  private PurchaseApprover nextApprover;

  @Override
  public void setNextApprover(PurchaseApprover nextApprover) {
    this.nextApprover = nextApprover;
  }

  @Override
  public void approve(int amount) {
    if (amount <= 1000) {
      System.out.println("Manager approved purhcase of $" + amount);
    } else if (nextApprover != null) {
      nextApprover.approve(amount);
    }
  }
}
