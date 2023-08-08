package Task3;

public class BurgerBuilder {
  private Burger burger;

  public BurgerBuilder(String burgerType) {
    burger = new Burger(burgerType);
  }

  public BurgerBuilder addLettuce() {
    burger.addLettuce();
    return this;
  }

  public BurgerBuilder addTomato() {
    burger.addTomato();
    return this;
  }

  public BurgerBuilder addCheese() {
    burger.addCheese();
    return this;
  }

  public BurgerBuilder addOnion() {
    burger.addOnion();
    return this;
  }

  public Burger build() {
    return burger;
  }
}
