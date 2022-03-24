package device;

public class LogitechHeadSet3 implements HeadsetDriver {
  @Override
  public void volumeUp(long id, int newVolume) {
    System.out.println("volume up LogitechHeadSet3");
  }
}
