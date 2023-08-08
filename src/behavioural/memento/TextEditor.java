package behavioural.memento;

public class TextEditor {
  String content;

  public TextEditor(String content) {
    this.content = content;
  }

  public void write(String s) {
    content += s;
  }

  public String getContent() {
    return content;
  }

  public Memento save() {
    return new Memento(content);
  }

  public void restore(Memento memento) {
    content = memento.getSavedContent();
  }
}
