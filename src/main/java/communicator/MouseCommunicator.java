package device;

import device.DeviceCommunicator;
import device.model.Mouse;

public class MouseCommunicator implements DeviceCommunicator {
  @Override
  public void sendChangeColorAction(Mouse mouse) {

    String changedColor = "";
    if (mouse.getColor() == 1) {
      changedColor = "red";
    }
    System.out.println(
        "Color for Mouse : " + mouse.getDeviceId() + " has been changed on " + changedColor);
  }
}
