package structural.adapter;

public class MediaAdapter implements MediaPlayer {
  private AdvancedMediaPlayer advancedMediaPlayer;

  public MediaAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
    this.advancedMediaPlayer = advancedMediaPlayer;
  }
  @Override
  public void play(String audioType, String fileName) {
    if (audioType.equalsIgnoreCase("mp3")) {
      advancedMediaPlayer.playMp3(fileName);
    } else if (audioType.equalsIgnoreCase("mp4")) {
      advancedMediaPlayer.playMp4(fileName);
    } else {
      System.out.println("Invalid file format : " + audioType + ". Only mp3 and mp4 format are supported.");
    }
  }
}
