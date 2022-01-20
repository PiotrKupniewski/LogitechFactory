package device;

public class Mouse implements Device {

  private final Long deviceId;

  public Mouse(Long deviceId) {
    this.deviceId = deviceId;
  }

  public void switchColor(String color) {
    System.out.println("Kolor zmieniony na : " + color);
  }
}
