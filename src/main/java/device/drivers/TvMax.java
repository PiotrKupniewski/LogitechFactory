package device.drivers;

import device.drivers.LedDriver;
import device.drivers.SensitiveDriver;
import device.drivers.VolumeDriver;

public class TvMax implements VolumeDriver, LedDriver, SensitiveDriver {
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
