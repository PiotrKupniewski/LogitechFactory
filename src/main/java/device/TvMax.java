package device;

public class TvMax implements HeadsetDriver, LedDriver, MouseSensitiveDriver {
  @Override
  public void volumeUp(long id, int newVolume) {
    System.out.println("TV volume up");
  }

  @Override
  public void changeColor(Integer newColor) {
    System.out.println("TV new color");
  }

  @Override
  public void mouseSensitive(double dpi) {
    System.out.println("TV sensitive");
  }
}
