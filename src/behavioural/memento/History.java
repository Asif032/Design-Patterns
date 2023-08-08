package behavioural.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
  List<Memento> history;

  public History() {
    history = new ArrayList<>();
  }

  public void addMemento(Memento memento) {
    history.add(memento);
  }

  public Memento getMemento(int index) {
    return history.get(index);
  }
}
