package device.drivers;

import device.drivers.led.LedDriver;
import device.drivers.sensitive.SensitiveDriver;
import device.drivers.sound.VolumeDriver;

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
