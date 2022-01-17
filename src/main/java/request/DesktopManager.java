package request;

import usecases.ColorChanger;

public class DesktopManager implements RequestManager {

  private final ColorChanger colorChanger = new ColorChanger();

  @Override
  public void switchLedColor(String deviceId, String color) {
    colorChanger.change(Long.valueOf(deviceId), color);
  }
}
