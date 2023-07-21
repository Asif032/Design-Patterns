package behavioural.chain_of_responsibility;

public class CEO implements PurchaseApprover {
  private PurchaseApprover nextApprover;

  @Override
  public void setNextApprover(PurchaseApprover nextApprover) {
    this.nextApprover = nextApprover;
  }

  @Override
  public void approve(int amount) {
    System.out.println("CEO approved purhcase of $" + amount);
  }
}
