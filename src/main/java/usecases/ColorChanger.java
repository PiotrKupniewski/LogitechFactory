package usecases;

import device.DeviceConfigurator;

public class ColorChanger {

  private final DeviceConfigurator configurator = new DeviceConfigurator();

  public void change(Long deviceId, String color) {
    configurator.changeDeviceLED(deviceId, color);
  }
}
