package device.drivers;

import device.drivers.LedDriver;
import device.drivers.SensitiveDriver;

public class MouseL4GDriver implements LedDriver, SensitiveDriver {
  @Override
  public void changeColor(Integer color) {
    String changedColor = "";
    if (color == 1) {
      changedColor = "red";
    }
    System.out.println("Color for Mouse : L4G has been changed on " + changedColor);
  }

  @Override
  public void mouseSensitive(double dpi) {
    System.out.println("Dpi adjusted for Mouse L4g");
  }
}
