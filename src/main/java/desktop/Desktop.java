package desktop;

public class Desktop {
  public static void main(String[] args) {
    var color = "red";
    var id = 1L;

    var desktopLogitechApp = new DesktopLogitechApp();
    desktopLogitechApp.processColorChange(id, color);
    desktopLogitechApp.mouseSensitive(1L,12.3);
  }
}
