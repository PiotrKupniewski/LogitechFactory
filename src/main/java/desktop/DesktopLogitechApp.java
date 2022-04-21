package desktop;

import device.Devices;
import device.DevicesLoader;

public class DesktopLogitechApp{

  DesktopColorTranslator colorTranslator;
  Devices devices;

  DesktopLogitechApp() {
    this.colorTranslator = new DesktopColorTranslator();
    this.devices = new DevicesLoader().load();
  }

  public void processColorChange(Long deviceID, String externalColor) {
    var color = colorTranslator.fromString(externalColor);
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
