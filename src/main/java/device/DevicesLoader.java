package device;

import device.drivers.KeyboardMax;
import device.drivers.LedDriver;
import device.drivers.LogitechHeadSet3;
import device.drivers.MouseL4GDriver;
import device.drivers.MouseMX3Driver;
import device.drivers.SensitiveDriver;
import device.drivers.TvMax;
import device.drivers.VolumeDriver;

import java.util.Map;

public class DevicesLoader {

  TvMax tvMax = new TvMax();

  Map<Long, LedDriver> ledDrivers =
      Map.of(
          1L, new MouseL4GDriver(),
          2L, new MouseMX3Driver(),
          3L, new KeyboardMax(),
          4L, tvMax);

  Map<Long, VolumeDriver> soundDrivers = Map.of(1L, new LogitechHeadSet3(), 4L, tvMax);

  Map<Long, SensitiveDriver> sensitiveDrivers =
      Map.of(
          1L, new MouseL4GDriver(),
          3L, new MouseMX3Driver(),
          4L, tvMax);

  public Devices load() {
    return new Devices(ledDrivers, soundDrivers, sensitiveDrivers);
  }
}
