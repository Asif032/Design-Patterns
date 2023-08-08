package tasks.task4_adapter;

public class Main {
  public static void main(String[] args) {
    MediaAdapter mediaAdapter = new MediaAdapter(new Mp3Player());
    mediaAdapter.play("mp3", "audio");

    mediaAdapter = new MediaAdapter(new Mp4Player());
    mediaAdapter.play("mp4", "video");
  }
}
