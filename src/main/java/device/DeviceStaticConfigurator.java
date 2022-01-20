package device;

import java.util.Map;

import static java.util.Optional.ofNullable;

public class DeviceStaticConfigurator implements DeviceCommunicator{

  private final Map<Long, Device> devices;

  public DeviceStaticConfigurator() {
    this.devices = getDevices() ;
  }

  @Override
  public Map<Long, Device> getDevices() {
    return Map.of(1L, new Mouse(1L));
  }

  @Override
  public Device getDeviceById(Long id) {
    return ofNullable(devices.get(id))
            .orElseThrow(() -> new IllegalArgumentException("Id not present in store"));
  }

  public void changeDeviceLED(Long deviceId, String color) {
    getDeviceById(deviceId).switchColor(color);
  }
}
