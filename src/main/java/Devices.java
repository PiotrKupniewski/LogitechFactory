import device.HeadsetDriver;
import device.LedDriver;
import device.LogitechHeadSet3;
import device.MouseL4GDriver;
import device.MouseMX3Driver;
import device.MouseSensitiveDriver;
import device.TvMax;

import java.util.Map;
import java.util.Objects;

public class Devices {

  TvMax tvMax = new TvMax();

  Map<Long, LedDriver> devices =
      Map.of(
          1L, new MouseL4GDriver(),
          2L, new MouseMX3Driver(),
          3L, new KeyboardMax(),
          4L, tvMax);

  Map<Long, HeadsetDriver> headsets = Map.of(1L, new LogitechHeadSet3(), 4L, tvMax);
  Map<Long, MouseSensitiveDriver> mouseDevices =
      Map.of(
          1L, new MouseL4GDriver(),
          3L, new MouseMX3Driver(),
          4L, tvMax);

  public void changeColor(Long deviceId, Integer newColor) {
    devices.get(deviceId).changeColor(newColor);
  }

  public void mouseSensitive(long mouseId, double dpi) {
    // TODO zerknać na mapę get or else
    var mouseSensitiveDriver = mouseDevices.get(mouseId);
    if (Objects.isNull(mouseSensitiveDriver)) {
      System.out.println("Nie wspieramy!");
    }
    mouseSensitiveDriver.mouseSensitive(dpi);
  }

  public void volumeUp(long id, int newVolume) {
    headsets.get(id).volumeUp(id, newVolume);
  }
}
