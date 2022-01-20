package usecases;

import device.DeviceStaticConfigurator;

public class ColorChanger {

  private final DeviceStaticConfigurator configurator = new DeviceStaticConfigurator();

  public void change(Long deviceId, String color) {
    configurator.changeDeviceLED(deviceId, color);
  }
}
