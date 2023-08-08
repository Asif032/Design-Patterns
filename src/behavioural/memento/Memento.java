package behavioural.memento;

public class Memento {
  String savedContent;

  public Memento(String content) {
    this.savedContent = content;
  }

  public String getSavedContent() {
    return savedContent;
  }
}
