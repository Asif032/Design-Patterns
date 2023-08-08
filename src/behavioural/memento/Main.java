package behavioural.memento;

public class Main {
  public static void main(String[] args) {
    TextEditor textEditor = new TextEditor("Hello");
    History history = new History();

    history.addMemento(textEditor.save());
    textEditor.write(", world!");
    System.out.println(textEditor.getContent());

    textEditor.restore(history.getMemento(0));
    System.out.println(textEditor.getContent());
  }
}
