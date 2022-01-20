package device;

import java.util.Map;

import static java.util.Optional.ofNullable;

public class DeviceConfigurator implements DeviceCommunicator{

  private Map<Long, Device> devices = Map.of(1L, new Mouse(1L));

  public void changeDeviceLED(Long deviceId, String color) {
    ofNullable(devices.get(deviceId))
        .orElseThrow(() -> new IllegalArgumentException("Id not present in store"))
        .switchColor(color);
  }
}
