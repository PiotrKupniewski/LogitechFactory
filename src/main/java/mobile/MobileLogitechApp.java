package mobile;

import device.Devices;
import device.DevicesLoader;

public class MobileLogitechApp {

  MobileColorTranslator colorTranslator;
  Devices devices;

  public MobileLogitechApp() {
    this.colorTranslator = new MobileColorTranslator();
    this.devices = new DevicesLoader().load();
  }
  public void processColorChange(Long deviceID, Long newColor) {
    var color = colorTranslator.fromLong(newColor);
    devices.changeColor(deviceID, color);
  }

  public void mouseSensitive(long mouseId, double dpi) {
    devices.mouseSensitive(mouseId, dpi);
  }

  public void volumeUp(long id, int newVolume) {
    devices.volumeUp(id, newVolume);
  }

  public void updateDrivers(long id) {
    devices.updateDriver(id);
  }
}
