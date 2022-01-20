package device;

import java.util.Map;

public interface DeviceCommunicator {
  Map<Long, Device> getDevices();

  Device getDeviceById(Long id);
}
