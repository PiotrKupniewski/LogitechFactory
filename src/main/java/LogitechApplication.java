import color.ColorTranslator;

public class LogitechApplication {

  ColorTranslator colorTranslator;
  Devices devices;

  public LogitechApplication(ColorTranslator colorTranslator, Devices devices) {
    this.colorTranslator = colorTranslator;
    this.devices = devices;
  }

  // ta tra powinna być poprawiona, long powinien przychodzic bezpośrednio z presentera
  // presenter jest endpoint'em
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
}
