package device.drivers;

import device.drivers.sound.VolumeDriver;

public class LogitechHeadSet3 implements VolumeDriver {
  @Override
  public void volumeUp(long id, int newVolume) {
    System.out.println("volume up LogitechHeadSet3");
  }
}
