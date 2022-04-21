package device;

import device.drivers.led.LedDriver;
import device.drivers.sensitive.SensitiveDriver;
import device.drivers.sound.VolumeDriver;

import java.util.Map;

import static java.util.Optional.ofNullable;

public class Devices {

  private final Map<Long, LedDriver> ledDrivers;
  private final Map<Long, VolumeDriver> soundDrivers;
  private final Map<Long, SensitiveDriver> sensitiveDrivers;

  Devices(
      Map<Long, LedDriver> ledDrivers,
      Map<Long, VolumeDriver> soundDrivers,
      Map<Long, SensitiveDriver> sensitiveDrivers) {

    this.ledDrivers = ledDrivers;
    this.soundDrivers = soundDrivers;
    this.sensitiveDrivers = sensitiveDrivers;
  }

  public void changeColor(Long deviceId, Integer newColor) {
    ledDrivers.get(deviceId).changeColor(newColor);
  }

  public void mouseSensitive(long mouseId, double dpi) {
   ofNullable(sensitiveDrivers.get(mouseId)).stream()
            .forEach(m->m.mouseSensitive(dpi));
  }

  public void volumeUp(long id, int newVolume) {
    soundDrivers.get(id).volumeUp(id, newVolume);
  }

  public void updateDriver(long id) {}
}
