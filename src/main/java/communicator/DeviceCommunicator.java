package device;

import device.model.Mouse;

public interface DeviceCommunicator {
  void sendChangeColorAction(Mouse mouse);
}
