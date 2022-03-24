package device;

public class MouseMX3Driver implements LedDriver, MouseSensitiveDriver{

  @Override
  public void changeColor(Integer newColor) {
    String changedColor = "";
    if (newColor == 1) {
      changedColor = "red";
    }
    System.out.println("Color for Mouse : MX3 has been changed on " + changedColor);
  }

  @Override
  public void mouseSensitive(double dpi) {
    System.out.println("Dpi adjusted for Mouse MX3" );
  }
}
