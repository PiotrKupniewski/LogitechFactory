package mobile;

import device.Devices;
import device.DevicesLoader;

public class MobileLogitechApp {

  MobileColorTranslator colorTranslator;
  Devices devices;

  MobileLogitechApp() {
    this.colorTranslator = new MobileColorTranslator();
    this.devices = new DevicesLoader().load();
  }
  void processColorChange(Long deviceID, Long newColor) {
    var color = colorTranslator.fromLong(newColor);
    devices.changeColor(deviceID, color);
  }
  void mouseSensitive(long mouseId, double dpi) {
    devices.mouseSensitive(mouseId, dpi);
  }

  public void volumeUp(long id, int newVolume) {
    devices.volumeUp(id, newVolume);
  }

  void updateDrivers(long id) {
    devices.updateDriver(id);
  }
}
