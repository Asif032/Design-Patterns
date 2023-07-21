package behavioural.chain_of_responsibility;

public class Director implements PurchaseApprover {
  private PurchaseApprover nextApprover;

  @Override
  public void setNextApprover(PurchaseApprover nextApprover) {
    this.nextApprover = nextApprover;
  }

  @Override
  public void approve(int amount) {
    if (amount <= 5000) {
      System.out.println("Director approved purhcase of $" + amount);
    } else if (nextApprover != null) {
      nextApprover.approve(amount);
    }
  }
}
