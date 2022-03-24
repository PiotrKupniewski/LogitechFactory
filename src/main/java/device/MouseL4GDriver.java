package device;

public class MouseL4GDriver implements LedDriver, MouseSensitiveDriver {
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
