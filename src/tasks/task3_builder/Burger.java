package tasks.task3_builder;

public class Burger {
  private String burgerType;
  private boolean hasLettuce;
  private boolean hasTomato;
  private boolean hasCheese;
  private boolean hasOnion;

  public Burger(String burgerType) {
    this.burgerType = burgerType;
  }

  public void addLettuce() {
    hasLettuce = true;
  }

  public void addTomato() {
    hasTomato = true;
  }

  public void addCheese() {
    hasCheese = true;
  }

  public void addOnion() {
    hasOnion = true;
  }

  public String getDescription() {
    StringBuilder description = new StringBuilder();
    description.append("Burger Type: ").append(burgerType);
    description.append(", Lettuce: ").append(hasLettuce);
    description.append(", Tomato: ").append(hasTomato);
    description.append(", Cheese: ").append(hasCheese);
    description.append(", Onion: ").append(hasOnion);
    return description.toString();
  }
}
