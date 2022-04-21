package device.drivers;

import device.drivers.VolumeDriver;

public class LogitechHeadSet3 implements VolumeDriver {
  @Override
  public void volumeUp(long id, int newVolume) {
    System.out.println("volume up LogitechHeadSet3");
  }
}
