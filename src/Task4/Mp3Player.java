package Task4;

public class Mp3Player implements AdvancedMediaPlayer {
  @Override
  public void playMp3(String fileName) {
    System.out.println("Playing Mp3 file : " + fileName);
  }

  @Override
  public void playMp4(String fileName) {
    // Mp3 player does not support mp4 format so do nothing
  }
}
