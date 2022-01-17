package device;

import java.util.Map;

public class DeviceConfigurator {

  private Map<Long, Mouse> mouses = Map.of(1L, new Mouse(1L));


  public void changeDeviceLED(Long deviceId, String color) {
    mouses.get(deviceId).switchColor(color);
  }
}
