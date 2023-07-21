package behavioural.chain_of_responsibility;

public interface PurchaseApprover {
  void setNextApprover(PurchaseApprover nextApprover);
  void approve(int amount);
}
