package structural.adapter;

public class Mp4Player implements AdvancedMediaPlayer {
  @Override
  public void playMp3(String fileName) {
    // Mp4 player does not support mp3 format so do nothing
  }

  @Override
  public void playMp4(String fileName) {
    System.out.println("Playing Mp4 file : " + fileName);
  }
}
